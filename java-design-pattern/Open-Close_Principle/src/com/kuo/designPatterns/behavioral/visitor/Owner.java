package com.kuo.designPatterns.behavioral.visitor;

/**
 * Owner
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 具体访问者角色类
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食🐱");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食🐕");
    }
}
