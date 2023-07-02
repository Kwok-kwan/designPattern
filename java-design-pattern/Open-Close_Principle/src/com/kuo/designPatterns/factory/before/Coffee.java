package com.kuo.designPatterns.factory.before;

/**
 * @Author GuoKunKun
 * @Description 咖啡类
 * @Date 2023/7/2 20:17
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar(){
        System.out.println("加糖");
    }

    public void addMilk(){
        System.out.println("加奶");
    }
}
