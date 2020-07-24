package com.icbc.demo.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    //添加视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器输入localhost:8080/或者localhost:8080/index.html,
        // 都会跳转到classpath:/templates/layuimini/page/user/login.html
        registry.addViewController("/login").setViewName("layuimini/page/user/login");
    }

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //登录拦截
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/asserts/**", "/webjars/**", "/lib/**",
                       "/", "/login", "/user/**");
    }
}
