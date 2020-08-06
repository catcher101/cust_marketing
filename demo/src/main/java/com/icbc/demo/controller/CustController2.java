package com.icbc.demo.controller;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.MarketingRecord;
import com.icbc.demo.service.CustInfo1Service;
import com.icbc.demo.service.CustService;
import com.icbc.demo.service.MarketingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/cust2")
public class CustController2 {

    @Autowired
    CustService custService;

    @GetMapping(value="/getCustPage")
    @ResponseBody
    public Map<String, Object> getCustPage(@RequestParam("page")Integer page,
                                           @RequestParam("limit")Integer limit){
        Map<String,Object> map = new HashMap<String, Object>();

        PageInfo<CombineTestSet> pageInfo = custService.getCustPage(page,limit);
        if(pageInfo == null){
            map.put("code", 1);//layui要求必须返回一个code，值为0表示操作成功，1表示失败
            map.put("msg", "操作失败");//返回的信息
        }else{
            map.put("code", 0);//layui要求必须返回一个code，值为0表示操作成功，1表示失败
            map.put("msg", "操作成功");//返回的信息
            map.put("count", pageInfo.getTotal());//总共有多少条真正的数据
            map.put("data", pageInfo.getList());//封装真正的数据
        }
          return map;
    }
}
