package com.icbc.demo.service;

import com.icbc.demo.entity.ShapeScore;
import com.icbc.demo.mapper.ShapeScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeScoreService {

    @Autowired
    private ShapeScoreMapper shapeScoreMapper;

    public ShapeScore findShapeScoreById(String individualid){
        ShapeScore shapeScore = shapeScoreMapper.selectByPrimaryKey(individualid);
        return shapeScore;
    }
}
