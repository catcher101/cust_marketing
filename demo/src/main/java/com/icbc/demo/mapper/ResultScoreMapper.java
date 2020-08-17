package com.icbc.demo.mapper;

import com.icbc.demo.entity.ResultScore;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResultScoreMapper {
    int deleteByPrimaryKey(String individualid);

    int insert(ResultScore record);

    int insertSelective(ResultScore record);

    ResultScore selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(ResultScore record);

    int updateByPrimaryKey(ResultScore record);
}