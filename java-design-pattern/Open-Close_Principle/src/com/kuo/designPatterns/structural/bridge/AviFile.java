package com.kuo.designPatterns.structural.bridge;

/**
 * AviFile
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description Avi视频文件（具体的实现化角色）
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Avi视频文件:"+fileName);
    }
}
