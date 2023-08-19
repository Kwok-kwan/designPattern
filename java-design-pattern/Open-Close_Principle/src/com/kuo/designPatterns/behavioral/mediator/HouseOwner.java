package com.kuo.designPatterns.behavioral.mediator;

/**
 * HouseOwner
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/19
 * @description 具体的同事角色类
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介沟通的方法
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取信息的方法
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }
}
