package com.kuo.designPatterns.builder.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author GuoKunKun
 * @Description TODO(描述该类的功能)
 * @Date 2023/5/30 18:43
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec("ipconfig");
        InputStream inputStream = exec.getInputStream();
        byte[] arr = new byte[1024*1024*100];
        int read = inputStream.read(arr);
        System.out.println(new String(arr,0,read,"GBK"));

    }
}
