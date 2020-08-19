package com.icbc.demo;

import com.icbc.demo.mapper.CombineTestSetMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		SqlSessionFactory s = null;
//		SqlSession sqlSession = s.openSession();
//		CombineTestSetMapper mapper = sqlSession.getMapper(CombineTestSetMapper.class);
//		mapper.selectUsersByParam(new HashMap<>());
	}

}
