package com.kuo.designPatterns.builder.singleton.demo2;

/**
 * @Author GuoKunKun
 * @Description 饿汉式：静态代码块
 * @Date 2023/5/30 17:08
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
