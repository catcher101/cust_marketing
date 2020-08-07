package com.icbc.demo.mapper;

import com.icbc.demo.entity.MarketRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MarketRecordMapper {
    int deleteByPrimaryKey(String individualid);

    int insert(MarketRecord record);

    int insertSelective(MarketRecord record);

    MarketRecord selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(MarketRecord record);

    int updateByPrimaryKey(MarketRecord record);

    List<MarketRecord> selectBasicRecord();

    List<MarketRecord> selectRecordsByParam(@Param("map") Map<String, Object> map);
}