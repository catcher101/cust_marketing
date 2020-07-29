package com.icbc.demo.mapper;

import com.icbc.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    //获取指定用户
    User selectUser(Integer id);

    //条件查询
    List<User> selectUsersByParam(@Param("map") Map<String, Object> map);

    //批量删除用户
    Integer deleteUsers(List<String> idsList);

    //删除用户
    Integer deleteUser(Integer id);

    //更新用户
    Integer updateUser(User user);

    //插入用户
    Integer insertUser(User user);

    //查询所有用户
    List<User> selectUsers();

    User selectUserByNameAndPwd(User user);
}
