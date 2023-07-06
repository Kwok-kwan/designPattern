package com.kuo.designPatterns.builder.factory.abstract_factory;

/**
 * @Author GuoKunKun
 * @Description 意大利风味甜品工厂
 * @Date 2023/7/6 22:02
 */
public class ItalianDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
