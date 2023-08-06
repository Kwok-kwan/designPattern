package com.kuo.designPatterns.structural.adapter.object_adapter;

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
        String s = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(s);
        new AdapterPra() {
            @Override
            public String readSD() {
                return null;
            }


        };
        
    }
}
