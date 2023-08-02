package com.kuo.designPatterns.builder.builder.demo1;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
