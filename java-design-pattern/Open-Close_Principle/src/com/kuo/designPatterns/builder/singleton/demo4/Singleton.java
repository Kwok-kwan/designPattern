package com.kuo.designPatterns.builder.singleton.demo4;

/**
 * @Author GuoKunKun
 * @Description 双重检查锁方式 懒汉式
 * @Date 2023/5/30 17:29
 */
public class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
