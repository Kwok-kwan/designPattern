package com.kuo.designPatterns.builder.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/7/6 23:57
 */
public class CoffeeFactory {

    // 加载配置文件，获取全限定类名，并存储
    // 定义容器
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 加载配置文件
    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String clazzName = p.getProperty((String) key);
                Class clazz = Class.forName(clazzName);
                Coffee o = (Coffee) clazz.newInstance();
                map.put((String) key, o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
