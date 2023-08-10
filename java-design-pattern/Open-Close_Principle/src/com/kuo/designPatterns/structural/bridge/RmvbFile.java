package com.kuo.designPatterns.structural.bridge;

/**
 * AviFile
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description Rmvb视频文件（具体的实现化角色）
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("Rmvb视频文件:"+fileName);
    }
}
