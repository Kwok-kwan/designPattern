package com.kuo.designPatterns.structural.bridge;

/**
 * OpreatingSystem
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description 抽象的操作系统类（抽象化角色）
 */
public abstract class OperatingSystem {
    protected VideoFile file;

    public OperatingSystem(VideoFile file) {
        this.file = file;
    }
    public abstract void play(String fileName);
}
