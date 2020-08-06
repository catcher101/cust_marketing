package com.icbc.demo.mapper;

import com.icbc.demo.entity.FeatureScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeatureScoreMapper {
    FeatureScore selectFeatureScorebyCustId(int custId);
}
