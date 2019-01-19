package com.example.java8.lesson13;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  14:38
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        //list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);

    }
}
