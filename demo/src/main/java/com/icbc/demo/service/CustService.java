package com.icbc.demo.service;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;

public interface CustService {

    PageInfo<CombineTestSet> getCustPage(Integer page, Integer limit);
}
