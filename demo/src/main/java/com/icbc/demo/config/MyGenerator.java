package com.icbc.demo.config;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis generator 启动类
 */
public class MyGenerator {

    public static void main(String[] args) throws Exception{
        new MyGenerator().generate();
    }

    //mybatis-generator 类方式启动
    public void generate() throws Exception{
        List<String> warnings=new ArrayList<String>();
        boolean overWriter=true;
        //指向配置文件　　
        File configFile=new File(MyGenerator.class.getResource("/generatorConfig.xml").getFile());
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overWriter);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }
}
