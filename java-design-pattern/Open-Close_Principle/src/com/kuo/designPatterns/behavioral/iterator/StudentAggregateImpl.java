package com.kuo.designPatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * StudentAggregateImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/20
 * @description 具体聚合角色
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
