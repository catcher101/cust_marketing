package com.icbc.demo.service;

import com.icbc.demo.entity.ValidSetShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountabilityService {

    //获取单特征分析的数据
    List<ValidSetShape> getEducation();

    //获取单特征分析的数据
    List<ValidSetShape> getJob();

    //获取单特征分析的数据
    List<ValidSetShape> getMonth();


    //获取单特征分析的数据
    List<ValidSetShape> getDay();

    //获取单特征分析的数据
    List<ValidSetShape> getDuration();

    //获取单特征分析的数据
    List<ValidSetShape> getBalance();

     //获取单特征分析的数据
    List<ValidSetShape> getAge();


}
