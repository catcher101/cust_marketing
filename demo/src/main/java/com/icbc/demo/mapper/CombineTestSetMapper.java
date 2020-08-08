package com.icbc.demo.mapper;

import com.icbc.demo.entity.CombineTestSet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CombineTestSetMapper {

    //更新指定客户的信息
    int updateCustById(CombineTestSet cust);

    //通过id查询客户
    CombineTestSet selectCustById(String individualid);

    //条件查询客户营销模块的基本信息
    List<CombineTestSet> selectUsersByParam(@Param("map") Map<String, Object> map);

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