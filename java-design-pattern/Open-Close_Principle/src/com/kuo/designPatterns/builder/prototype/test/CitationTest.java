package com.kuo.designPatterns.builder.prototype.test;

/**
 * CitationTest
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/7/31
 * @description TODO
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
//        citation.setName("Tom");
//        clone.setName("Jack");
        Student student = new Student();
        student.setName("Tom");
        citation.setStudent(student);
        Citation clone = citation.clone();
        clone.getStudent().setName("Jack");
        citation.show();
        clone.show();
    }
}
