package com.icbc.demo.controller;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.MarketRecord;
import com.icbc.demo.entity.User;
import com.icbc.demo.service.MarketRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/marketrecord")
public class MarketRecordController {


    @Autowired
    MarketRecordService marketRecordService;


    @GetMapping(value="/getMarketRecord")
    @ResponseBody
    public Map<String, Object> getMarketRecord(@RequestParam("page")Integer page,
                                           @RequestParam("limit")Integer limit){
        Map<String,Object> map = new HashMap<String, Object>();

        PageInfo<MarketRecord> pageInfo = marketRecordService.getMarketRecord(page,limit);
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


    @GetMapping(value="/marketDetail")
    public String marketDetail(String individualid, Model model){
        MarketRecord marketRecord = marketRecordService.getMarketRecordById(individualid);

        model.addAttribute("individualid",individualid);

        model.addAttribute("name",marketRecord.getName());
        model.addAttribute("contact",marketRecord.getContact());
        model.addAttribute("day",marketRecord.getDay());
        model.addAttribute("month",marketRecord.getMonth());
        model.addAttribute("duration",marketRecord.getDuration());
        model.addAttribute("campaign", marketRecord.getCampaign());

        model.addAttribute("pdays",marketRecord.getPdays());
        model.addAttribute("previous",marketRecord.getPrevious());
        model.addAttribute("poutcome",marketRecord.getPoutcome());

        return "layuimini/page/marketRecord/market-detail";
    }

    @GetMapping(value="/editRecord")
    public String editRecord(String individualid, Model model){
        MarketRecord marketRecord = marketRecordService.getMarketRecordById(individualid);
        model.addAttribute("custRecord",marketRecord);
        return "layuimini/page/marketRecord/market-edit";
    }

    @PostMapping(value="/saveRecord")
    @ResponseBody
    public Map<String, Object> saveRecord(MarketRecord record){
        Map<String, Object> map = new HashMap<>();

        Integer count = marketRecordService.updateMarketRecordById(record);

        if(count <= 0){
            map.put("code", 1);
        }
        map.put("code", 0);
        return map;
    }

    @GetMapping(value="/getRecordByParam")
    @ResponseBody
    public Map<String, Object> getPageByParam(Integer page,
                                              Integer limit,
                                              @RequestParam Map map){
        Map<String, Object> map1 = new HashMap<>();
        PageInfo<MarketRecord> pageInfo = marketRecordService.getRecordByParam(page, limit, map);

        System.out.println(pageInfo);

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

}
