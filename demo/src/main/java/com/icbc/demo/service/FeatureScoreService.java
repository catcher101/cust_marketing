package com.icbc.demo.service;

import com.icbc.demo.entity.FeatureScore;
import com.icbc.demo.mapper.FeatureScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureScoreService {

    @Autowired
    FeatureScoreMapper featureScoreMapper;

    public FeatureScore findFeatureScore(int custId){
        return featureScoreMapper.selectFeatureScorebyCustId(custId);
    }
}
