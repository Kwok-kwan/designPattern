package com.kuo.designPatterns.builder.singleton.demo7;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author GuoKunKun
 * @Description 序列化破坏单例模式
 * @Date 2023/5/30 18:02
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    public static void readObjectFromFile() throws  Exception {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("C:\\Users\\13555\\Desktop\\singleton.txt"));
        Singleton instance = (Singleton) stream.readObject();
        System.out.println(instance);
        stream.close();
    }

    public static void writeObjectToFile() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\13555\\Desktop\\singleton.txt"));
        stream.writeObject(instance);
        stream.close();
    }
}
