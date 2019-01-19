package com.example.java8.lesson20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  15:57
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome","world hello","hello world hello",
                "hello welcome");
        list.stream().flatMap(item -> Arrays.stream(item.split(" "))).distinct().forEach(System.out::println);
    }
}
