package com.kuo.designPatterns.behavioral.visitor;

/**
 * Person
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 抽象访问者角色类
 */
public interface Person {
    void feed(Cat cat);
    void feed(Dog dog);
}
