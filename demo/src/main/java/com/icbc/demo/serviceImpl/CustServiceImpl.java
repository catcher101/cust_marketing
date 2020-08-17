package com.icbc.demo.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;
import com.icbc.demo.entity.User;
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
        return cust;
    }

    @Override
    public PageInfo<CombineTestSet> getCustPageByParam(Integer page, Integer limit,
                                                       Map<String, Object> map) {
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
