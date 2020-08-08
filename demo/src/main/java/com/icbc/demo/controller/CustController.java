package com.icbc.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.FeatureScore;
import com.icbc.demo.entity.MarketingRecord;
import com.icbc.demo.service.CustInfo1Service;
import com.icbc.demo.service.FeatureScoreService;
import com.icbc.demo.service.MarketingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/cust")
public class CustController {

    @Autowired
    private CustInfo1Service custInfo1Service;

    @Autowired
    private MarketingRecordService marketingRecordService;

    @Autowired
    private FeatureScoreService featureScoreService;

//    @RequestMapping(path = "/getCustPage",method = RequestMethod.GET)
    @GetMapping(value="/getCustPage")
    @ResponseBody
    public Map<String, Object> getCustPage(@RequestParam("page")Integer page,
                                           @RequestParam("limit")Integer limit){

        Map<String,Object> map = new HashMap<String, Object>();

//        List<CustInfo1> list = custInfo1Service.findCustInfo1();
        PageInfo<CustInfo1> pageInfo = custInfo1Service.getCustPage(page,limit);

        map.put("code", 0);//layui要求必须返回一个code，值为0表示操作成功，1表示失败
        map.put("msg", "操作成功");//返回的信息
        map.put("count", pageInfo.getTotal());//总共有多少条真正的数据
        map.put("data", pageInfo.getList());//封装真正的数据
        return map;
//        List<CustInfo1> list = custInfo1Service.findCustInfo1();
//        List<Map<String,Object>> custInfo1  = new ArrayList<>();
//        if(list != null){
//            for(CustInfo1 cust:list){
//                Map<String, Object> map = new HashMap<>();
//                map.put("cust",cust);
//
//                custInfo1.add(map);
//            }
//        }
//        return custInfo1;

    }

    @RequestMapping(path="/addMarketingRecord",method = RequestMethod.GET)
    public String addMarketingRecord(Integer id, Model model){
        model.addAttribute("cust_id",id);
        return "layuimini/page/cust/marketingrecord-add";
    }

    @RequestMapping(path = "/addRecord",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addRecord(MarketingRecord marketingRecord){
        Map<String,Object> map = new HashMap<>();
        Integer count = marketingRecordService.addMarketingRecord(marketingRecord);
        if(count<=0){
            map.put("code",1);
            map.put("msg","操作失败");
        }else{
            map.put("code",0);
            map.put("msg","操作成功");
        }
        return map;
    }

    @RequestMapping(path="/getMarketingRecord",method = RequestMethod.GET)
    public String getMarketingRecord(Integer id, Model model){
        model.addAttribute("cust_id",id);
        return "layuimini/page/cust/record-detail";
    }


    @RequestMapping(path="/getRecord",method = RequestMethod.GET)
    @ResponseBody  //异步请求，还是要加@ResponseBody
    public Map<String, Object> getRecordPage(Integer id,@RequestParam("page")Integer page,
                                           @RequestParam("limit")Integer limit){
        Map<String,Object> map = new HashMap<String, Object>();
        PageInfo<MarketingRecord> pageInfo = marketingRecordService.getRecordPage(id,page,limit);

        System.out.print(pageInfo);

        map.put("code", 0);   //layui要求必须返回一个code，值为0表示操作成功，1表示失败
        map.put("msg", "操作成功");//返回的信息
        map.put("count", pageInfo.getTotal());//总共有多少条真正的数据
        map.put("data", pageInfo.getList());//封装真正的数据


        return map;
    }

    @RequestMapping(path="/getFeature",method = RequestMethod.GET)
    public String getFeature(Integer id,Model model){
        CustInfo1 custInfo1 = custInfo1Service.findCustInfo1ById(id);
        FeatureScore featureScore = featureScoreService.findFeatureScore(id);

        model.addAttribute("recommend",custInfo1.getRecommend());
        model.addAttribute("en_name",custInfo1.getEnName());
        model.addAttribute("prim_nat",custInfo1.getPrimNat());
        model.addAttribute("gender",custInfo1.getGender());
        model.addAttribute("birthdate",custInfo1.getBirthdate());
        model.addAttribute("phone1",custInfo1.getPhone1());

        model.addAttribute("cust_id",featureScore.getCustId());
        model.addAttribute("age",featureScore.getAge());
        model.addAttribute("age_score",featureScore.getAgeScore());
        model.addAttribute("profession",featureScore.getProfession());
        model.addAttribute("profession_score",featureScore.getProfessionScore());
        model.addAttribute("education",featureScore.getEducation());
        model.addAttribute("education_score",featureScore.getEducationScore());
        model.addAttribute("marital_status",featureScore.getMaritalStatus());
        model.addAttribute("marital_status_score",featureScore.getMaritalStatusScore());
        return "layuimini/page/cust/feature-detail";
    }



}
