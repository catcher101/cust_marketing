package com.icbc.demo.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;

import com.icbc.demo.mapper.CombineTestSetMapper;
import com.icbc.demo.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustServiceImpl implements CustService {

    @Autowired
    CombineTestSetMapper combineTestSetMapper;

    @Override
    public int updateCustById(CombineTestSet cust) {
        return combineTestSetMapper.updateCustById(cust);
    }

    @Override
    public CombineTestSet getCustById(String individualid) {
        CombineTestSet cust = combineTestSetMapper.selectCustById(individualid);
        String nationality = cust.getNationality();
        if(nationality.equals("446")){
            cust.setNationality("中国澳门");
        }
        else if(nationality.equals("156")){
            cust.setNationality("中国内地");
        }
        else if(nationality.equals("344")){
            cust.setNationality("中国香港");
        }
       else if(nationality.equals("158")){
            cust.setNationality("中国台湾");
        }

        String delt = cust.getDeltGreet();
        if(delt.equals("0")) {
            cust.setDeltGreet("未知");
        }
        else if(delt.equals("1")) {
            cust.setDeltGreet("先生");
        }
        else if(delt.equals("2")) {
            cust.setDeltGreet("夫人");
        }
        else if(delt.equals("4")) {
            cust.setDeltGreet("博士");
        }
        else if(delt.equals("5")) {
            cust.setDeltGreet("爵士");
        }
        else if(delt.equals("6")) {
            cust.setDeltGreet("女士");
        }
        else if(delt.equals("7")) {
            cust.setDeltGreet("小姐");
        }
        else if(delt.equals("8")) {
            cust.setDeltGreet("太太");
        }
        else if(delt.equals("9")) {
            cust.setDeltGreet("医生");
        }
        else if(delt.equals("10")) {
            cust.setDeltGreet("修女");
        }
        else if(delt.equals("11")) {
            cust.setDeltGreet("神父");
        }

        return cust;
    }

    @Override
    public PageInfo<CombineTestSet> getCustPageByParam(Integer page, Integer limit,
                                                       Map<String, String> map) {
        PageHelper.startPage(page, limit);
        List<CombineTestSet> list = combineTestSetMapper.selectUsersByParam(map);
        PageInfo<CombineTestSet> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<CombineTestSet> getCustPageByCommend(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<CombineTestSet> list = combineTestSetMapper.selectUsersByCommend();
        PageInfo<CombineTestSet> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    @Override
    public PageInfo<CombineTestSet> getCustPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<CombineTestSet> list =  combineTestSetMapper.selectBasicInfo();
        PageInfo<CombineTestSet> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
