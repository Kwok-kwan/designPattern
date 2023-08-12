package com.kuo.designPatterns.behavioral.temlate;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai b = new ConcreteClass_BaoCai();
        b.cookPrecess();
    }
}
