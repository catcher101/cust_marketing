package com.icbc.demo.service;

import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.User;

import java.util.List;
import java.util.Map;


public interface UserService {

    //获取指定用户
    User getUser(Integer id);

    //条件搜索
    PageInfo<User> getUserPageByParam(Integer page, Integer limit, Map<String, Object> map);

    //批量删除用户
    Integer deleteUsers(List<String> idsList);

    //删除用户
    Integer deleteUser(Integer id);

    //更新用户
    Integer updateUser(User user);

    //添加用户
    Integer addUser(User user);

    //获取登录用户的分页数据
    PageInfo<User> getUserPage(Integer page, Integer limit);

    User login(User user);
}
