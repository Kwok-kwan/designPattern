package com.kuo.designPatterns.behavioral.iterator;

import java.util.List;

/**
 * StudentIteratorImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/20
 * @description 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0; // 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
