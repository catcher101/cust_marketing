package com.icbc.demo.mapper;

import com.icbc.demo.entity.Result;

public interface ResultMapper {
    int deleteByPrimaryKey(String individualid);

    int insert(Result record);

    int insertSelective(Result record);

    Result selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}