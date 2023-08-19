package com.kuo.designPatterns.behavioral.observer;

/**
 * Subject
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/16
 * @description 抽象主题角色类
 */
public interface Subject {
    // 添加订阅者（观察者对象）
    void attach(Observer observer);

    // 删除观察者对象
    void detach(Observer observer);

    // 通知订阅者更新小心
    void notify(String message);
}
