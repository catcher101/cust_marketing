package com.icbc.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 定制ErrorController，目的是能使SpringBoot找到自己定制的错误页面
 * 大部分的代码BasicController一致，关键点是修改错误页面的路径
 */
@Controller
@RequestMapping(value = "/error")
public class MyBasicErrorController implements ErrorController {


    @RequestMapping(produces = {"text/html"})//返回给浏览器
    public String handlerError(HttpServletRequest request, Model model){
        WebRequest webRequest = new ServletWebRequest(request);//对request进行包装，目的是能操作更多的方法
        HttpStatus status = this.getStatus(request);//获取status

        String path = (String) webRequest.getAttribute("javax.servlet.error.request_uri", 0);
        String message = (String) webRequest.getAttribute("javax.servlet.error.message", 0);
        if(message.equals("")){
            message = "No Available Message";
        }

        //携带错误数据信息
        model.addAttribute("timestamp", new Date());
        model.addAttribute("statusCode", status.value());
        model.addAttribute("error", status.getReasonPhrase());
        model.addAttribute("message", message);
        model.addAttribute("path", path);

        int i = status.value() / 100;//判断是4xx还是5xx错误
        if(i == 4){
            return "layuimini/page/error/4xx";//使用自己定制的错误页面
        }else if(i == 5){
            return "layuimini/page/error/5xx";//使用自己定制的错误页面
        }
        return null;
    }

    @RequestMapping//返回给客户端
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        WebRequest webRequest = new ServletWebRequest(request);//对request进行包装，目的是能操作更多的方法
        HttpStatus status = this.getStatus(request);//获取status
        Map<String, Object> map = new HashMap<>();

        if (status == HttpStatus.NO_CONTENT) {
            return new ResponseEntity(status);
        } else {

            String path = (String) webRequest.getAttribute("javax.servlet.error.request_uri", 0);
            String message = (String) webRequest.getAttribute("javax.servlet.error.message", 0);

            map.put("timestamp", new Date());
            map.put("statusCode", status.value());
            map.put("error", status.getReasonPhrase());
            map.put("message", message);
            map.put("path", path);

            return new ResponseEntity(map, status);
        }
    }



    protected HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            try {
                return HttpStatus.valueOf(statusCode);
            } catch (Exception var4) {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }
    }

    @Override
    public String getErrorPath() {
        return "null";
    }
}
