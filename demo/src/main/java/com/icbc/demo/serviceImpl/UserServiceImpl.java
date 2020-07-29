package com.icbc.demo.serviceImpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icbc.demo.entity.User;
import com.icbc.demo.mapper.UserMapper;
import com.icbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        return userMapper.selectUser(id);
    }

    @Override
    public PageInfo<User> getUserPageByParam(Integer page, Integer limit, Map<String, Object> map) {
        PageHelper.startPage(page, limit);
        List<User> list = userMapper.selectUsersByParam(map);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer deleteUsers(List<String> idsList) {
        return userMapper.deleteUsers(idsList);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public PageInfo<User> getUserPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);//传入起始页码以及查询条数
        List<User> list = userMapper.selectUsers();//查询所有用户
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    //用户登录判断
    @Override
    public User login(User user) {
        User loginUser = userMapper.selectUserByNameAndPwd(user);
        return loginUser;
    }
}
