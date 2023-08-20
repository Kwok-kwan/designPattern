package com.kuo.designPatterns.behavioral.iterator;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/20
 * @description 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("kuo","17070207"));
        studentAggregate.addStudent(new Student("lisi","17070208"));
        studentAggregate.addStudent(new Student("wangwu","17070209"));
        studentAggregate.addStudent(new Student("zhaoliu","17070210"));
        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }
    }
}
