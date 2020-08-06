package com.icbc.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.CustInfo1;
import com.icbc.demo.entity.MarketingRecord;
import com.icbc.demo.service.CustInfo1Service;
import com.icbc.demo.service.MarketingRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class ServiceTests {

    @Autowired
    private CustInfo1Service custInfo1Service;

    @Autowired
    private MarketingRecordService marketingRecordService;


    @Test
    public void testCustInfo1Service(){
        List<CustInfo1> list = custInfo1Service.findCustInfo1();
        for(CustInfo1 cust:list){
            System.out.println(cust);
        }
    }

    //@Test
    public void testMarketingRecordService(){
        MarketingRecord  record = new MarketingRecord();
        record.setCustId(1);
        record.setMarketTime("20200730");
        record.setMarketEffect("成功");
        record.setRemark("该客户比较好说话");
        marketingRecordService.addMarketingRecord(record);
    }

//    @Test
    public void testGetRecordPage(){
        PageInfo<MarketingRecord> pageInfo = marketingRecordService.getRecordPage(1,1,10);
        System.out.print(pageInfo);
    }



}
