package com.kuo.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionSubject
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/16
 * @description 具体主题角色类
 */
public class SubscriptionSubject implements Subject {
    // 集合 存储观察者对象
    private List<Observer> wechatUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        wechatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : wechatUserList) {
            observer.update(message);
        }
    }
}
