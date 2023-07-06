package com.kuo.designPatterns.builder.factory.abstract_factory;

/**
 * @Author GuoKunKun
 * @Description test
 * @Date 2023/7/6 22:04
 */
public class Client {
    public static void main(String[] args) {
//        ItalianDessertFactory italianDessertFactory = new ItalianDessertFactory();
        AmericanDessertFactory f = new AmericanDessertFactory();
        Dessert dessert = f.createDessert();

        Coffee coffee = f.createCoffee();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
