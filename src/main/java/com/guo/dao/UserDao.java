package com.guo.dao;

import com.guo.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author 98231
 * @ClassName： UserDao
 * @create 2019-01-05 22:32
 * @desc
 **/
@Repository
public interface UserDao {


    /**
     * 增加一个用户
     */
    public Integer addUser(User user);

    /**
     * 删除一个用户
     */
    public Integer deleteUser(User user);

    /**
     * 更新用户的信息
     */
    public Integer updateUser(User user);

    /**
     * 根据id查询用户
     */
    public User getById(User user);

    /**
     * 根据用户名查询用户
     */
    public User getByUserName(String userName);

    /**
     * 获得所有用户的数量
     */
    public Long getCount();

    /**
     * 通过邮箱获取对应的用户
     */
    User getByEmail(String email);
}
