package com.example.java8.lesson18;

import java.util.stream.IntStream;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  13:41
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest8 {
    public static void main(String[] args) {
//        IntStream.iterate(0, i -> (i+1) % 2).distinct().limit(6).forEach(System.out::println);
        IntStream.iterate(0, i -> i % 2).limit(6).distinct().forEach(System.out::println);
    }
}
