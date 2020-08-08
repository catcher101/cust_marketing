package com.icbc.demo.service;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;

import java.util.Map;

public interface CustService {

    //通过id查询客户
    CombineTestSet getCustById(String individualid);

    //条件查询客户
    PageInfo<CombineTestSet> getCustPageByParam(Integer page, Integer limit,
                                                Map<String, Object> map);

    //获取所有客户的信息
    PageInfo<CombineTestSet> getCustPage(Integer page, Integer limit);
}
