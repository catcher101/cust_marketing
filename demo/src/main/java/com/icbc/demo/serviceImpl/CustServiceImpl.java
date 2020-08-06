package com.icbc.demo.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;
import com.icbc.demo.mapper.CombineTestSetMapper;
import com.icbc.demo.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustServiceImpl implements CustService {

    @Autowired
    CombineTestSetMapper combineTestSetMapper;

    @Override
    public PageInfo<CombineTestSet> getCustPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<CombineTestSet> list =  combineTestSetMapper.selectBasicInfo();
        PageInfo<CombineTestSet> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
