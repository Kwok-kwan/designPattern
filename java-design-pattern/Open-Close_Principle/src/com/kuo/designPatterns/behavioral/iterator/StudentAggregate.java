package com.kuo.designPatterns.behavioral.iterator;

/**
 * StudentAggregate
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/20
 * @description 抽象聚合角色接口
 */
public interface StudentAggregate {
    // 添加学生功能
    void addStudent(Student student);
    // 删除学生功能
    void removeStudent(Student student);
    // 获取迭代器对象功能
    StudentIterator getStudentIterator();
}
