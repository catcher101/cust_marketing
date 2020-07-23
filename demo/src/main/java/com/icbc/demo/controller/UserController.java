package com.icbc.demo.controller;

import com.icbc.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 登录系统的用户控制器
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @GetMapping(value="/login")
    public String login(User user){
        System.out.println(user);
        return "login success";
    }
}
