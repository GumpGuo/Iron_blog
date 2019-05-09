package com.guo.service.impl;

import com.guo.dao.UserDao;
import com.guo.model.User;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName： UserServiceImpl
 * @author： 98231
 * @create： 2019-01-14 22:28
 * @desc： 用户类逻辑层
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public User getByEmail(String email) {
        return userDao.getByEmail(email);
    }
}
