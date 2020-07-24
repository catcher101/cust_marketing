package com.icbc.demo.controller;

import com.icbc.demo.entity.User;
import com.icbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录系统的用户控制器
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserService userService;



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
