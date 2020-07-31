package com.icbc.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.mapper.CustInfo1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustInfo1Service {

    @Autowired
    private CustInfo1Mapper custInfo1Mapper;

    public List<CustInfo1> findCustInfo1(){

        return custInfo1Mapper.selectCustInfo1();
    }

    public PageInfo<CustInfo1> getCustPage(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<CustInfo1> list = custInfo1Mapper.selectCustInfo1();
        PageInfo<CustInfo1> pageInfo = new PageInfo<CustInfo1>(list);
        return pageInfo;
    }

}
