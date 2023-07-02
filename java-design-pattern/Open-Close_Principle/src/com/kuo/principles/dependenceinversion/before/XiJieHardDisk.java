package com.kuo.principles.dependenceinversion.before;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/21 21:19
 */
public class XiJieHardDisk {
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据为"+data);
    }
    public String get(){
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
