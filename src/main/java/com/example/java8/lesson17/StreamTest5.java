package com.example.java8.lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  09:51
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","helloworld","test");
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-------------");

        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        list2.stream().map(item -> item * item).forEach(System.out::println);

        System.out.println("-------------");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2,3),
                Arrays.asList(4,5,6));
        stream.flatMap(integers -> integers.stream().map(item -> item * item)).forEach(System.out::println);

    }
}
