package com.gm.wj.dao;

import com.gm.wj.model.User;
import org.springframework.stereotype.Component;
/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
@Component
public interface UserMapper {

    User findByUsername(String username);

    User getByUsernameAndPassword(User user);

    int add(User user);
}
