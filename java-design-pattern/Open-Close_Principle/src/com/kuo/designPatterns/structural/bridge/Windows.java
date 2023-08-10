package com.kuo.designPatterns.structural.bridge;

/**
 * Windows
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description 扩展抽象化角色 windows操作系统
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile file) {
        super(file);
    }

    @Override
    public void play(String fileName) {
        file.decode(fileName);
    }
}
