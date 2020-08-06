package com.icbc.demo.mapper;

import com.icbc.demo.entity.CombineTestSet;

public interface CombineTestSetMapper {
    int deleteByPrimaryKey(String individualid);

    int insert(CombineTestSet record);

    int insertSelective(CombineTestSet record);

    CombineTestSet selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(CombineTestSet record);

    int updateByPrimaryKey(CombineTestSet record);
}