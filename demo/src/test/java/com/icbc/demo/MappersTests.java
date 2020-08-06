package com.icbc.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.FeatureScore;
import com.icbc.demo.mapper.AccountBalanceMapper;
import com.icbc.demo.mapper.CustInfo1Mapper;
import com.icbc.demo.mapper.CustInfoMapper;

import com.icbc.demo.entity.AccountBalance;
import com.icbc.demo.entity.CustInfo;
import com.icbc.demo.mapper.FeatureScoreMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Calendar;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class MappersTests {
    @Autowired
    private CustInfoMapper custInfoMapper;

    @Autowired
    private CustInfo1Mapper custInfo1Mapper;

    @Autowired
    private AccountBalanceMapper accountBalanceMapper;

    @Autowired
    private FeatureScoreMapper featureScoreMapper;

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

    @Test
    public void testselectCustInfo1(){

        PageHelper.startPage(1,10);
        List<CustInfo1> list = custInfo1Mapper.selectCustInfo1();

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        for(CustInfo1 cust1:list){
            if (cust1.getGender().equals("1")){
                cust1.setGender("男");
            }
            if (cust1.getGender().equals("2")){
                cust1.setGender("女");
            }
            if(cust1.getPrimNat().equals("446")){
                cust1.setPrimNat("中国澳门");
            }
            if(cust1.getPrimNat().equals("156")){
                cust1.setPrimNat("中国");
            }
            if(cust1.getPrimNat().equals("344")){
                cust1.setPrimNat("中国香港");
            }
            if(cust1.getPrimNat().equals("446")){
                cust1.setPrimNat("中国台湾");
            }

            String birth = cust1.getBirthdate();
            int age = year - Integer.valueOf(birth.substring(0,4));
            cust1.setBirthdate(String.valueOf(age));
        }

        System.out.println(list);

        //PageInfo<CustInfo1> pageInfo = new PageInfo<CustInfo1>(list);

        //System.out.println(pageInfo);

    }

    @Test
    public void testselectFeatureScore(){
        FeatureScore featureScore = featureScoreMapper.selectFeatureScorebyCustId(1);
        System.out.println(featureScore);

    }

}
