package com.icbc.demo.mapper;

import com.icbc.demo.entity.CombineTestSet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CombineTestSetMapper {


    //查询客户营销模块的基本信息
    List<CombineTestSet> selectBasicInfo();


    //------以下为mybatis逆向工程自动生成的方法，为防止报错暂时不删去
    int deleteByPrimaryKey(String individualid);

    int insert(CombineTestSet record);

    int insertSelective(CombineTestSet record);

    CombineTestSet selectByPrimaryKey(String individualid);

    int updateByPrimaryKeySelective(CombineTestSet record);

    int updateByPrimaryKey(CombineTestSet record);
}