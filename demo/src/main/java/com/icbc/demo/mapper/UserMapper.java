package com.icbc.demo.mapper;

import com.icbc.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    User selectUserByNameAndPwd(User user);
}
