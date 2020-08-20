package com.icbc.demo.mapper;

import com.icbc.demo.entity.ShapeScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShapeScoreMapper {
    int deleteByPrimaryKey(String individualid);

    int insert(ShapeScore record);

    int insertSelective(ShapeScore record);

    ShapeScore selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(ShapeScore record);

    int updateByPrimaryKey(ShapeScore record);
}