package com.icbc.demo.controller;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.MarketingRecord;
import com.icbc.demo.entity.User;
import com.icbc.demo.service.CustInfo1Service;
import com.icbc.demo.service.CustService;
import com.icbc.demo.service.MarketingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.icbc.demo.service.ResultScoreService;
import com.icbc.demo.entity.ResultScore;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/cust2")
public class CustController2 {

    @Autowired
    CustService custService;

    @Autowired
    ResultScoreService resultScoreService;


    //获取指定的用户
    @GetMapping(value="/getCustForDetail")
    public String getUserForDetail(String individualid, Model model){
        System.out.println("individualid:" + individualid);
        CombineTestSet cust = custService.getCustById(individualid);
        if(cust != null){
            System.out.println(cust);
            model.addAttribute("cust", cust);
        }
        ResultScore resultScore = resultScoreService.findResultScoreById(individualid);
        model.addAttribute("scoreAge", resultScore.getScoreAge());
        model.addAttribute("scoreBalance", resultScore.getScoreBalance());
        model.addAttribute("scoreDuration", resultScore.getScoreDuration());
        model.addAttribute("scoreCampaign", resultScore.getScoreCampaign());
        model.addAttribute("scorePdays", resultScore.getScorePdays());
        model.addAttribute("scorePrevious", resultScore.getScorePrevious());

        return "layuimini/page/cust2/cust-detail.html";
    }

    @GetMapping(value="/getCustForEdit")
    public String getCustForEdit(String individualid, Model model){
        CombineTestSet cust = custService.getCustById(individualid);
        model.addAttribute("cust", cust);
        return "layuimini/page/cust2/cust-edit";
    }

    //更新用户
    @ResponseBody
    @PostMapping(value="/saveCust")
    public Map<String, Object> saveCust(CombineTestSet cust){
        Map<String, Object> map = new HashMap<>();
        System.out.println("Cust: " + cust);
        Integer count = custService.updateCustById(cust);
        if(count <= 0){
            map.put("code", 1);
            return map;
        }
        map.put("code", 0);
        return map;
    }


    @GetMapping(value="/getPageByParam")
    @ResponseBody
    public Map<String, Object> getPageByParam(Integer page,
                                              Integer limit,
                                              @RequestParam Map<String, String> map){
        Map<String, Object> map1 = new HashMap<>();
        PageInfo<CombineTestSet> pageInfo = custService.getCustPageByParam(page, limit, map);
        if(pageInfo == null){
            map1.put("code", 1);
            map1.put("msg", "操作失败");
            return map1;
        }
        map1.put("code", 0);
        map1.put("msg", "操作成功");
        map1.put("count", pageInfo.getTotal());
        map1.put("data", pageInfo.getList());
        return map1;
    }

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
