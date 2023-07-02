package com.kuo.designPatterns.factory.factory_method;

/**
 * @Author GuoKunKun
 * @Description 美式咖啡工厂对象，生产美式咖啡
 * @Date 2023/7/2 22:07
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmeriacanCoffee();
    }
}
