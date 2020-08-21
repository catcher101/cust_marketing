package com.icbc.demo.mapper;

import com.icbc.demo.entity.ValidSetShape;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ValidSetShapeMapper {


    List<ValidSetShape> selectEducation();

    List<ValidSetShape> selectJob();

    List<ValidSetShape> selectMonth();


    List<ValidSetShape> selectDay();

    List<ValidSetShape> selectDuration();


    List<ValidSetShape> selectBalance();


    List<ValidSetShape> selectAge();

    int insert(ValidSetShape record);

    int insertSelective(ValidSetShape record);
}