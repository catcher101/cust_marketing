package com.icbc.demo.serviceImpl;


import com.icbc.demo.entity.User;
import com.icbc.demo.mapper.UserMapper;
import com.icbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //用户登录判断
    @Override
    public User login(User user) {
        User loginUser = userMapper.selectUserByNameAndPwd(user);
        return loginUser;
    }
}
