package com.kuo.designPatterns.builder.prototype.test1;

import java.io.*;

/**
 * CitationTest
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description TODO
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("Tom");
        citation.setStudent(student);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\13555\\Desktop\\singleton.txt"));
        objectOutputStream.writeObject(citation);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\13555\\Desktop\\singleton.txt"));
        Citation o =(Citation) objectInputStream.readObject();
        objectInputStream.close();
        o.getStudent().setName("Jack");
        citation.show();
        o.show();
    }
}
