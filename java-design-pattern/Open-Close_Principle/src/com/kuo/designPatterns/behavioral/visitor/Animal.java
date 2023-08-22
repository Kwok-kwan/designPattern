package com.kuo.designPatterns.behavioral.visitor;

/**
 * Animal
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 抽象元素角色类
 */
public interface Animal {
 void accept(Person person);
}
