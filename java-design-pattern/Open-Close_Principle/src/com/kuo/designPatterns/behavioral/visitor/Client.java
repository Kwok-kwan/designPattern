package com.kuo.designPatterns.behavioral.visitor;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/21
 * @description 访问者模式
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        Owner owner = new Owner();
        Someone someone = new Someone();
        home.action(owner);
        home.action(someone);
    }
}
