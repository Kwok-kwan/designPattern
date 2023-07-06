package com.kuo.designPatterns.builder.factory.abstract_factory;

/**
 * @Author GuoKunKun
 * @Description 美式风味的甜品共产
 * @Date 2023/7/6 22:00
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmeriacanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
