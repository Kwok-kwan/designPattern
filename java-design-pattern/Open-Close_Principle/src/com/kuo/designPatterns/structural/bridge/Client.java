package com.kuo.designPatterns.structural.bridge;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Mac(new RmvbFile());
        operatingSystem.play("封神");
    }
}
