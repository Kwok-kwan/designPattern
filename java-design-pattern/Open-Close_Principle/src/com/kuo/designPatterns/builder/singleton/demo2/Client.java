package com.kuo.designPatterns.builder.singleton.demo2;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/30 17:12
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
