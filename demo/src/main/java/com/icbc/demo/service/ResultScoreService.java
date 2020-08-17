package com.icbc.demo.service;

import com.icbc.demo.entity.ResultScore;
import com.icbc.demo.mapper.ResultScoreMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ResultScoreService {

    @Autowired
    private ResultScoreMapper resultScoreMapper;

    public ResultScore findResultScoreById(String individualid) {
        ResultScore resultScore = resultScoreMapper.selectByPrimaryKey(individualid);
        return resultScore;
    }

}
