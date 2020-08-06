package com.icbc.demo.mapper;
import com.icbc.demo.entity.CustInfo;
import com.icbc.demo.entity.CustInfo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustInfo1Mapper {
//    CustInfo selectByIndividualid(String individualid);
    List<CustInfo1> selectCustInfo1();

    CustInfo1 selectCustInfo1ById(Integer id);
}
