package com.kuo.designPatterns.behavioral.iterator;

/**
 * StudentIterator
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/20
 * @description 抽象迭代器角色接口
 */
public interface StudentIterator {
    // 判断是否还有元素
    boolean hasNext();
    // 获取下一个元素
    Student next();
}
