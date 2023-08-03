package com.kuo.designPatterns.structural.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyFactory
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/3
 * @description 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        // 返回代理对象
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy the proxy instance that the method was invoked on
                     *
                     * @param method the {@code Method} instance corresponding to
                     * the interface method invoked on the proxy instance.  The declaring
                     * class of the {@code Method} object will be the interface that
                     * the method was declared in, which may be a superinterface of the
                     * proxy interface that the proxy class inherits the method through.
                     *
                     * @param args an array of objects containing the values of the
                     * arguments passed in the method invocation on the proxy instance,
                     * or {@code null} if interface method takes no arguments.
                     * Arguments of primitive types are wrapped in instances of the
                     * appropriate primitive wrapper class, such as
                     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
                     *
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke()方法执行了！");
                        System.out.println("代售点收取服务费用！jdk动态代理！");
                        String name = method.getName();
                        System.out.println(name);
                        Object invoke = method.invoke(station,args);
                        return invoke;
                    }
                });
        return proxyObject;
    }
}
