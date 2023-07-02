package com.kuo.designPatterns.factory.static_factory;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/2 21:19
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee latte = store.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
