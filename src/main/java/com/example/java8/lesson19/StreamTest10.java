package com.example.java8.lesson19;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  15:22
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
//        list.stream().filter(item -> item.length() ==5).findFirst().ifPresent(item -> System.out.println(item.length()));
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        //流具有短路的特性。
    }
}
