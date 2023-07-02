package com.kuo.designPatterns.builder.singleton.demo8;


import java.lang.reflect.Constructor;

/**
 * @Author GuoKunKun
 * @Description 反射破坏单例模式
 * @Date 2023/5/30 18:02
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton = constructor.newInstance();
        Singleton singleton1 = constructor.newInstance();
        System.out.println(singleton1 == singleton);

    }

}
