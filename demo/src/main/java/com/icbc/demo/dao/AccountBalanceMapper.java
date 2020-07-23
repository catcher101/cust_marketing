package com.icbc.demo.dao;

import com.icbc.demo.entity.AccountBalance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountBalanceMapper {
    AccountBalance selectByProtseno(String protseno);
}
