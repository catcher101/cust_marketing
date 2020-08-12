package com.icbc.demo.mapper;
import com.icbc.demo.entity.Phone;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneMapper {
//    CustInfo selectByIndividualid(String individualid);

    Phone selectPhoneById(String individualid);
}
