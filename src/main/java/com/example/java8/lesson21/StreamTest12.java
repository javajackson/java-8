package com.example.java8.lesson21;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  16:33
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi","Hello","你好！");
        List<String> list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).
                forEach(System.out::println);
    }
}
