package com.icbc.demo.mapper;
import com.icbc.demo.entity.CustInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustInfoMapper {
    CustInfo selectByIndividualid(String individualid);

    CustInfo selectByRegNo(String regNo);

    int insertCustInfo(CustInfo custInfo);
}
