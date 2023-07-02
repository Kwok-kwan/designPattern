package com.kuo.designPatterns.builder.singleton.demo8;

import java.io.Serializable;

/**
 * @Author GuoKunKun
 * @Description 静态内部类方式
 * @Date 2023/5/30 17:39
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class){

            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
