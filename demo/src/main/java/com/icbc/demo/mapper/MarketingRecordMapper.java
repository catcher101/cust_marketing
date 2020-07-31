package com.icbc.demo.mapper;
import com.icbc.demo.entity.MarketingRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MarketingRecordMapper {
    List<MarketingRecord> selectRecords(Integer custId);

    int insertMarketingRecord(MarketingRecord marketingRecord);
//    List<MarketingRecord> selectMarketingRecord(int custId);

}
