package com.example.java8.lesson11;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  09:38
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.operator(5, 10, (a, b) -> a *b));

        System.out.println(test.getShort("ac", "b", (a, b) -> a.length()-b.length()));
    }

    private int operator(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a, b);
    }

    private String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
