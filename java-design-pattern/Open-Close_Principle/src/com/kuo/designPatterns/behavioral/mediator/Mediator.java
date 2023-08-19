package com.kuo.designPatterns.behavioral.mediator;

/**
 * Mediator
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/19
 * @description 抽象中介者类
 */
public abstract class Mediator {
    public abstract void contact(String message,Person person);
}
