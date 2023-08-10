package com.kuo.designPatterns.structural.bridge;

/**
 * VedioFile
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/9
 * @description 视频文件（实现化角色）
 */
public interface VideoFile {
    void decode(String fileName);
}
