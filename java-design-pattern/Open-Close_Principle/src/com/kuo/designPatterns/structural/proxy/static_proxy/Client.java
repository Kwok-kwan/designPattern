package com.kuo.designPatterns.structural.proxy.static_proxy;

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
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
