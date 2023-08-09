package com.kuo.designPatterns.structural.decorator;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        FastFood rice = new FriedRice();
        System.out.println(rice.getDesc()+"   "+rice.cost()+"元");
        rice = new Egg(rice);
        System.out.println(rice.getDesc()+"   "+rice.cost()+"元");
        rice = new Egg(rice);
        System.out.println(rice.getDesc()+"   "+rice.cost()+"元");

    }
}
