package com.guo.service;

import com.guo.model.User;

/**
 * @ClassName： UserService
 * @author： 98231
 * @create： 2019-01-14 22:27
 * @desc：
 **/
public interface UserService {

    User getByEmail(String email);
}
