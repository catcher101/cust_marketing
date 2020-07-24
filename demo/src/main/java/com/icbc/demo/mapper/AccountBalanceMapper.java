package com.icbc.demo.mapper;

import com.icbc.demo.entity.AccountBalance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountBalanceMapper {
    AccountBalance selectByProtseno(String protseno);
}
