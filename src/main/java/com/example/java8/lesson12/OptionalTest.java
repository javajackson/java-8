package com.example.java8.lesson12;

import java.util.Optional;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  11:37
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        /*if(optional.isPresent()){
            System.out.println(optional.get());
        }*/
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("-----------------------------------");
        Optional<String> optional2 = Optional.empty();
        System.out.println(optional2.orElse("world!"));
        System.out.println("-----------------------------------");
        System.out.println(optional2.orElseGet(() -> "nihao"));
    }
}
