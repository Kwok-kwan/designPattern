package com.kuo.designPatterns.builder.prototype.test1;

import java.io.Serializable;

/**
 * Student
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description 学生
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
