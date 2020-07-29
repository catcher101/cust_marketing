package com.icbc.demo.controller;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.User;
import com.icbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 登录系统的用户控制器
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserService userService;


    //获取指定的用户
    @GetMapping(value="/getUserForEdit")
    public String getUserForEdit(Integer id, Model model){
        System.out.println("id:" + id);
        User user = userService.getUser(id);
        System.out.println("指定User：" + user);
        model.addAttribute("user", user);
        return "layuimini/page/user/user-edit";
    }

    //获取指定的用户
    @GetMapping(value="/getUserForDetail")
    public String getUserForDetail(Integer id, Model model){
        System.out.println("id:" + id);
        User user = userService.getUser(id);
        System.out.println("指定User：" + user);
        model.addAttribute("user", user);
        return "layuimini/page/user/user-detail";
    }


    //条件查询,入参map接收前端发送的请求参数
    @ResponseBody
    @GetMapping(value="/getPageByParam")
    public Map<String, Object> getPageByParam(Integer page,
                                              Integer limit,
                                              @RequestParam Map map){
        Map<String, Object> map1 = new HashMap<>();
        PageInfo<User> pageInfo = userService.getUserPageByParam(page, limit, map);
        if(pageInfo == null){
            map1.put("code", 1);
            map1.put("msg", "操作失败");
        }
        map1.put("code", 0);
        map1.put("msg", "操作成功");
        map1.put("count", pageInfo.getTotal());
        map1.put("data", pageInfo.getList());
        return map1;
    }

    //批量删除用户
    @ResponseBody
    @PostMapping(value="/deleteUsers")
    public Map<String, Object> deleteUsers(@RequestParam("ids") String ids){
        Map<String, Object> map = new HashMap<>();
        System.out.println("ids:" + ids);
        String[] idsArray = ids.split(",");
        List<String> idsList = new ArrayList<>(idsArray.length);
        Collections.addAll(idsList, idsArray);//copy一份List类型的id数组
        Integer count = userService.deleteUsers(idsList);
        if(count <= 0){
            map.put("code", 1);
            map.put("msg", "删除失败");
        }
        map.put("code", 0);
        map.put("msg", "删除成功");
        return map;
    }

    //删除用户
    @ResponseBody
    @PostMapping(value="/deleteUser")
    public Map<String, Object> deleteUser(@RequestParam("id") Integer id){
        Map<String, Object> map = new HashMap<>();
        Integer count = userService.deleteUser(id);
        if(count <= 0){
            map.put("code", 1);
        }
        map.put("code", 0);
        return map;
    }


    //更新用户
    @ResponseBody
    @PostMapping(value="/updateUser")
    public Map<String, Object> updateUser(User user){
        Map<String, Object> map = new HashMap<>();
        System.out.println("User: " + user);
        Integer count = userService.updateUser(user);
        if(count <= 0){
            map.put("code", 1);
        }
        map.put("code", 0);
        return map;
    }

    //添加用户
    @ResponseBody
    @PostMapping(value="/addUser")
    public Map<String, Object> addUser(User user){
        Map<String, Object> map = new HashMap<>();
        System.out.println("User: " + user);
        Integer count =  userService.addUser(user);
        if(count <= 0){
            map.put("code", 1);
            map.put("msg", "操作失败");
        }
        map.put("code", 0);
        map.put("msg", "操作成功");
        return map;
    }

    //获取登录用户的分页数据
    @ResponseBody
    @GetMapping(value = "/getPage")
    public Map<String, Object> getUserPage(Integer page, Integer limit){
        Map<String, Object> map = new HashMap<>();
        PageInfo<User> pageInfo = userService.getUserPage(page, limit);
        if(pageInfo == null){
            map.put("code", 1);//layui要求code值为1，表示操作失败
            map.put("msg", "操作失败");
        }
        map.put("code", 0);
        map.put("msg", "操作成功");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());//layui要求数据必须封装到data中
        return map;
    }

    //动态获取登录用户的用户名在界面的右上角
    @ResponseBody
    @GetMapping(value="/username")
    public Map<String, Object> isLogin(HttpSession session){
        Map<String, Object> map = new HashMap<>();
        User loginUser = (User)session.getAttribute("loginUser");
        map.put("loginUser", loginUser);
        return map;
    }

    @PostMapping(value="/login")
    public String login(User user, Model model, HttpSession session){
        User loginUser = userService.login(user);
        if(loginUser != null){
            session.setAttribute("loginUser", loginUser);//提供给登录拦截功能使用
            return "redirect:/index.html";//登录成功则重定向
        }
        model.addAttribute("msg", "账户或密码错误");
        //thymeleaf模板引擎解析，前往classpath:/templates/layuimini/page/user/login.html重新登录
        //模板引擎拼串："classpath:/templates" + "/xx/xx" + ".html"
        return "layuimini/page/user/login";
    }
}
