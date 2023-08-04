package com.kuo.designPatterns.structural.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ProxyFactory
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/4
 * @description 代理对象工厂
 */
public class ProxyFactory implements MethodInterceptor {
    private TrainStation station = new TrainStation();
    public TrainStation getProxyObject(){
        // 创建Enhancer对象，类似jdk中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject =(TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//        System.out.println(obj);
//        System.out.println("方法执行了！");
        System.out.println("cglib代理收取费用！");
        Object invoke = method.invoke(station, args);
        return invoke;
    }
}
