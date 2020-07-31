package com.icbc.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.MarketingRecord;
import com.icbc.demo.mapper.MarketingRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketingRecordService {

    @Autowired
    private MarketingRecordMapper marketingRecordMapper;

    public int addMarketingRecord(MarketingRecord marketingRecord){
        if(marketingRecord==null){
            throw new IllegalArgumentException("参数不能为空！");
        }

        return marketingRecordMapper.insertMarketingRecord(marketingRecord);
    }


    public PageInfo<MarketingRecord> getRecordPage(Integer custId, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<MarketingRecord> list = marketingRecordMapper.selectRecords(custId);
        PageInfo<MarketingRecord> pageInfo = new PageInfo<MarketingRecord>(list);
        return pageInfo;
    }
}
