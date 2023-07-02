package com.kuo.designPatterns.builder.singleton.demo3;

/**
 * @Author GuoKunKun
 * @Description 懒汉式：（线程不安全的方式） + synchronized优化
 * @Date 2023/5/30 17:16
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if ( instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
