package com.kuo.designPatterns.builder.factory.factory_method;

/**
 * @Author GuoKunKun
 * @Description 拿铁咖啡工厂
 * @Date 2023/7/2 22:08
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
