package com.icbc.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoMybatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
