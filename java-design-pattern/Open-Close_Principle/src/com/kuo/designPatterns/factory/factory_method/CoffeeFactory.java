package com.kuo.designPatterns.factory.factory_method;

/**
 * @Author GuoKunKun
 * @Description 抽象工厂
 * @Date 2023/7/2 22:05
 */
public interface CoffeeFactory {
    // 创建咖啡对象的方法
    Coffee createCoffee();
}
