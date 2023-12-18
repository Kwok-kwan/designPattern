package com.kuo.dao.impl;

import com.kuo.dao.UserDao;

/**
 * UserDaoImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/25
 * @description 数据访问层实现类
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("userDao被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDao add......");
    }
}