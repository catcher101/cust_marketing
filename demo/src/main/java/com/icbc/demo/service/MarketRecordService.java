package com.icbc.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CombineTestSet;
import com.icbc.demo.entity.MarketRecord;
import com.icbc.demo.entity.User;
import com.icbc.demo.mapper.MarketRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MarketRecordService {

    @Autowired
    private MarketRecordMapper marketRecordMapper;

    public PageInfo<MarketRecord> getMarketRecord(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<MarketRecord> list =  marketRecordMapper.selectBasicRecord();
        PageInfo<MarketRecord> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    public MarketRecord getMarketRecordById(String individualid) {
        return marketRecordMapper.selectByPrimaryKey(individualid);
    }

    public int updateMarketRecordById(MarketRecord record){
        return marketRecordMapper.updateByPrimaryKey(record);
    }

    public PageInfo<MarketRecord> getRecordByParam(Integer page, Integer limit, Map<String, Object> map) {
        PageHelper.startPage(page, limit);
        List<MarketRecord> list = marketRecordMapper.selectRecordsByParam(map);
        PageInfo<MarketRecord> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
