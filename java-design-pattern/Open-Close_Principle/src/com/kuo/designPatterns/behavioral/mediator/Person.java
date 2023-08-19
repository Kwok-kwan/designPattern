package com.kuo.designPatterns.behavioral.mediator;

/**
 * Person
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/19
 * @description 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
