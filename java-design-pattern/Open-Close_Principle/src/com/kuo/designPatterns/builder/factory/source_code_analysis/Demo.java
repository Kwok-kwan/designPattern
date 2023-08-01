package com.kuo.designPatterns.builder.factory.source_code_analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author GuoKunKun
 * @Description Java源码分析
 * @Date 2023/7/14 12:08
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collection<String> collection;
        strings.add("gkk");
        strings.add("kwok");
        strings.add("kwan");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
