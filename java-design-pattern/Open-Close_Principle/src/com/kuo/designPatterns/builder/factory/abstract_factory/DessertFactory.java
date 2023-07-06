package com.kuo.designPatterns.builder.factory.abstract_factory;

/**
 * @Author GuoKunKun
 * @Description 甜品工厂接口
 * @Date 2023/7/6 21:52
 */
public interface DessertFactory {

    Coffee createCoffee();

    Dessert createDessert();
}
