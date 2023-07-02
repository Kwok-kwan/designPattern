package com.kuo.designPatterns.builder.singleton.demo1;

/**
 * @Author GuoKunKun
 * @Description 饿汉式：静态成员变量
 * @Date 2023/5/30 17:00
 */
public class Singleton {
    // 私有化构造方法
    private Singleton(){

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }


}
