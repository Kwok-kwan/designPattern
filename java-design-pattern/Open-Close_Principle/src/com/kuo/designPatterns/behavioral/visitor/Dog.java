package com.kuo.designPatterns.behavioral.visitor;

/**
 * Cat
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 具体元素角色类
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪");
    }
}
