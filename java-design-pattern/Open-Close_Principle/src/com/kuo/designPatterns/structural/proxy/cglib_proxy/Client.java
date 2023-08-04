package com.kuo.designPatterns.structural.proxy.cglib_proxy;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/4
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
