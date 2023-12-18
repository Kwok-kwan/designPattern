package com.kuo.service.impl;

import com.kuo.dao.UserDao;
import com.kuo.service.UserService;

/**
 * UserServiceImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/25
 * @description 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("userservice被创建了");
    }

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService add......");
        userDao.add();
    }
}
