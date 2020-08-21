package com.icbc.demo.serviceImpl;

import com.icbc.demo.entity.ValidSetShape;
import com.icbc.demo.mapper.ValidSetShapeMapper;
import com.icbc.demo.service.AccountabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountabilityServiceImpl implements AccountabilityService {


    @Autowired
    private ValidSetShapeMapper validSetShapeMapper;

    @Override
    public List<ValidSetShape> getEducation() {
        List<ValidSetShape> list = validSetShapeMapper.selectEducation();
        return list;
    }

    @Override
    public List<ValidSetShape> getJob() {
        List<ValidSetShape> list = validSetShapeMapper.selectJob();
        return list;
    }

    @Override
    public List<ValidSetShape> getMonth() {
        List<ValidSetShape> list = validSetShapeMapper.selectMonth();
        return list;
    }

    @Override
    public List<ValidSetShape> getDay() {
        List<ValidSetShape> list = validSetShapeMapper.selectDay();
        return list;
    }

    @Override
    public List<ValidSetShape> getDuration() {
        List<ValidSetShape> list = validSetShapeMapper.selectDuration();
        return list;
    }

    @Override
    public List<ValidSetShape> getBalance() {
        List<ValidSetShape> list = validSetShapeMapper.selectBalance();
        return list;
    }

    @Override
    public List getAge() {
        List<ValidSetShape> list = validSetShapeMapper.selectAge();
        return list;
    }

}
