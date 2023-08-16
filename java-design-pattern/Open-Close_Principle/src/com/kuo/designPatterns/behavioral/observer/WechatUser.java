package com.kuo.designPatterns.behavioral.observer;

/**
 * WechatUser
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/16
 * @description 具体的观察者角色类
 */
public class WechatUser implements Observer {
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
