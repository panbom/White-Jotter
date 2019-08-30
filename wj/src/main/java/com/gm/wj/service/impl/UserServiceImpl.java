package com.gm.wj.service.impl;

import com.gm.wj.dao.UserMapper;
import com.gm.wj.model.User;
import com.gm.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author panbo
 * @version 1.0.0
 * @ClassName UserServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 10:59:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public User getByUsernameAndPassword(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.getByUsernameAndPassword(user);
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }
}
