package com.kuo.designPatterns.builder.factory.config_factory;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/7 0:09
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american);
    }
}
