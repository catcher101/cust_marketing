package com.icbc.demo;

import com.icbc.demo.dao.AccountBalanceMapper;
import com.icbc.demo.dao.CustInfoMapper;

import com.icbc.demo.entity.AccountBalance;
import com.icbc.demo.entity.CustInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class MappersTests {
    @Autowired
    private CustInfoMapper custInfoMapper;

    @Autowired
    private AccountBalanceMapper accountBalanceMapper;

    @Test
    public void testSelectCustInfo(){
        CustInfo custInfo = custInfoMapper.selectByIndividualid("011900020000519");
        System.out.println(custInfo);
    }

    @Test
    public void testSelectAccountBalance(){
        AccountBalance accountBalance = accountBalanceMapper.selectByProtseno("01190001110111840");
        System.out.println(accountBalance);
    }
}
