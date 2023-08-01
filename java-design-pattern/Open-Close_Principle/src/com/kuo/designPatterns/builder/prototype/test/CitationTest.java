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
        Citation clone = citation.clone();
        citation.setName("Tom");
        clone.setName("Jack");
        citation.show();
        clone.show();
    }
}
