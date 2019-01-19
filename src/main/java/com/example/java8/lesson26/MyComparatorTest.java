package com.example.java8.lesson26;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/13  09:30
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao111", "hello111", "world111", "welcome");

//        Collections.sort(list,(str1, str2) -> str1.length() - str2.length());
//        list.sort((str1, str2) -> str2.length() - str1.length());
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        Collections.sort(list,Comparator.comparingInt((String item) -> item.length()).reversed());
//        list.sort(Comparator.comparingInt(String::length).reversed());
//        list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) ->item1.toUpperCase().compareTo(item2.toUpperCase())));
//        Collections.sort(list, Comparator.comparingInt(String::length).
//                thenComparing(Comparator.comparing(String::toUpperCase)));
//        Collections.sort(list, Comparator.comparing(String::length).
//                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

//        Collections.sort(list, Comparator.comparing(String::length).reversed().
//                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())).thenComparing(Comparator.reverseOrder()));

        System.out.println(list);
    }
}
