package com.kuo.designPatterns.builder.prototype.test1;

import java.io.Serializable;

/**
 * Citation
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description 浅克隆
 */
public class Citation implements Cloneable, Serializable {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show(){
        System.out.println(student.getName()+"在此学期表现优秀，特发此奖状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
