package com.kuo.designPatterns.factory.factory_method;

/**
 * @Author GuoKunKun
 * @Description 测试类
 * @Date 2023/7/2 22:11
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
