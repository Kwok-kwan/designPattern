package com.kuo.designPatterns.builder.builder.demo2;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/2
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        Phone build = new Phone.Builder().cpu("core").memory("kingston").screen("sansang").mainBoard("huashuo").build();
        System.out.println(build);
    }
}
