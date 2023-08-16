package com.kuo.designPatterns.behavioral.observer;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/16
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.attach(new WechatUser("kuo"));
        subject.attach(new WechatUser("kwok"));
        subject.attach(new WechatUser("kwan"));
        subject.notify("跳槽去更好的公司吧！");
    }
}
