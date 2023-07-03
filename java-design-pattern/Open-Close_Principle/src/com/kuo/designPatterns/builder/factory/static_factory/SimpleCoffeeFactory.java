package com.kuo.designPatterns.builder.factory.static_factory;


/**
 * @Author GuoKunKun
 * @Description 简单咖啡工厂类
 * @Date 2023/7/2 21:12
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("American".equals(type)) {
            coffee = new AmeriacanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
