package com.icbc.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.mapper.CustInfo1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class CustInfo1Service {

    @Autowired
    private CustInfo1Mapper custInfo1Mapper;

    public List<CustInfo1> findCustInfo1(){

        return custInfo1Mapper.selectCustInfo1();
    }

    public PageInfo<CustInfo1> getCustPage(Integer page,Integer limit){
        PageHelper.startPage(page,limit);

        List<CustInfo1> list = custInfo1Mapper.selectCustInfo1();

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

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

        //System.out.println(list);

        PageInfo<CustInfo1> pageInfo = new PageInfo<CustInfo1>(list);

        return pageInfo;
    }


    public CustInfo1 findCustInfo1ById(Integer id) {

        CustInfo1 custInfo1 = custInfo1Mapper.selectCustInfo1ById(id);
        if (custInfo1.getGender().equals("1")){
            custInfo1.setGender("男");
        }
        if (custInfo1.getGender().equals("2")){
            custInfo1.setGender("女");
        }
        if(custInfo1.getPrimNat().equals("446")){
            custInfo1.setPrimNat("中国澳门");
        }
        if(custInfo1.getPrimNat().equals("156")){
            custInfo1.setPrimNat("中国");
        }
        if(custInfo1.getPrimNat().equals("344")){
            custInfo1.setPrimNat("中国香港");
        }
        if(custInfo1.getPrimNat().equals("446")){
            custInfo1.setPrimNat("中国台湾");
        }
        String birth = custInfo1.getBirthdate();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int age = year - Integer.valueOf(birth.substring(0,4));
        custInfo1.setBirthdate(String.valueOf(age));

        return custInfo1;
    }
}
