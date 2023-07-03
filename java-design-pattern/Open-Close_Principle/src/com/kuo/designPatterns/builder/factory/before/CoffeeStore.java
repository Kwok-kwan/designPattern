package com.kuo.designPatterns.builder.factory.before;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/2 20:21
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if ("American".equals(type)){
            coffee = new AmeriacanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
