package com.example.java8.lesson17;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  12:16
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.stream().map(item -> item.substring(0,1).toUpperCase() + item.substring(1)).
                forEach(System.out::println);


    }
}
