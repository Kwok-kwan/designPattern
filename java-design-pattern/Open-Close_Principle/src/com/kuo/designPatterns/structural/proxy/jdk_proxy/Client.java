package com.kuo.designPatterns.structural.proxy.jdk_proxy;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/3
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
        while (true){}
    }
}
