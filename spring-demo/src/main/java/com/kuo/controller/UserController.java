package com.kuo.controller;

import com.kuo.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * UserController
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/25
 * @description TODO
 */
public class UserController {
    public static void main(String[] args) {
        // 创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        UserService userService = beanFactory.getBean("userService", UserService.class);
        userService.add();
    }
}
