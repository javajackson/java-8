package com.example.java8.lesson8;

import java.util.function.Predicate;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/6  16:11
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PredicateTest {
    public static void main(String[] args) {

        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
