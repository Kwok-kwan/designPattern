package com.kuo.principles.dependenceinversion.after;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/21 21:21
 */
public class IntelCpu implements Cpu{
    public void run(){
        System.out.println("使用英特尔处理器");
    }
}
