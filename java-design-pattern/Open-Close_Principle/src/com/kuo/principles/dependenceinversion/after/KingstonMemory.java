package com.kuo.principles.dependenceinversion.after;

/**
 * @Author GuoKunKun
 * @Description 金士顿内存条类
 * @Date 2023/5/21 21:22
 */
public class KingstonMemory implements Memory{
    public void save(){
        System.out.println("使用金士顿内存条");
    }
}
