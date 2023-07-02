package com.kuo.designPatterns.builder.singleton.demo5;

/**
 * @Author GuoKunKun
 * @Description 静态内部类方式
 * @Date 2023/5/30 17:39
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }


}
