package com.kuo.designPatterns.builder.singleton.demo7;

import java.io.Serializable;

/**
 * @Author GuoKunKun
 * @Description 静态内部类方式
 * @Date 2023/5/30 17:39
 */
public class Singleton implements Serializable {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时，会将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }


}
