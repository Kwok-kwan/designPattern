package com.kuo.designPatterns.structural.adapter.class_adapter;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));
        System.out.println("---------------------");
        System.out.println(computer.readSD(new SDAdapterTF()));
        
    }
}
