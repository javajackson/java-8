package com.example.java8.lesson6;

import java.util.function.Function;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/6  11:35
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FunctionTest {
    public static void main(String[] args) {

        FunctionTest test = new FunctionTest();

        /*System.out.println(test.compute(1,value -> { return 2 * value;}));
        System.out.println(test.compute(2,value -> 5 + value));
        System.out.println(test.compute(3,value -> value * value));

        System.out.println(test.convert(5, value -> String.valueOf(value)));*/


        Function<Integer, Integer> function = value -> value * 2;
        System.out.println(test.compute(4,function));



    }

    private int compute(int a, Function<Integer,Integer> function){
        return function.apply(a);
    }

    private  String convert(int a, Function<Integer, String> function){
        return function.apply(a);
    }
}
