package com.gm.wj.service;

import com.gm.wj.model.User;

/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
public interface UserService {
    public User findByUsername(String username);

    public User getByUsernameAndPassword(String username, String password);

    public int add(User user);
}
