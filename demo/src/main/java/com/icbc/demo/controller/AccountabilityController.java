package com.icbc.demo.controller;

import com.icbc.demo.entity.ValidSetShape;
import com.icbc.demo.service.AccountabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 透明性特征得分模块的controller
 */
@Controller
@RequestMapping("/accountability")
public class AccountabilityController {


    @Autowired
    private AccountabilityService accountabilityService;

    @ResponseBody
    @GetMapping("/getEducation")
    public Map<String, Object> getEducation(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getEducation();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/getJob")
    public Map<String, Object> getJob(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getJob();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }

    @ResponseBody
    @GetMapping("/getMonth")
    public Map<String, Object> getMonth(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getMonth();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }


    @ResponseBody
    @GetMapping("/getDuration")
    public Map<String, Object> getDuration(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getDuration();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }


    @ResponseBody
    @GetMapping("/getDay")
    public Map<String, Object> getDay(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getDay();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }


    @ResponseBody
    @GetMapping("/getBalance")
    public Map<String, Object> getBalance(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getBalance();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }


    @ResponseBody
    @GetMapping("/getAge")
    public Map<String, Object> getAge(){
        HashMap<String, Object> map = new HashMap<>();
        List<ValidSetShape> list = accountabilityService.getAge();
        System.out.println(list);
        if(list != null){
            map.put("data", list);
            map.put("msg", "图表加载成功");
        }else{
            map.put("msg", "图表加载失败");
        }
        return map;
    }


}
