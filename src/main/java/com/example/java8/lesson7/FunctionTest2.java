package com.example.java8.lesson7;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/6  14:06
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 test2 = new FunctionTest2();
        //System.out.println(test2.compute(2, value -> value * 3 , value -> value * value));
        //System.out.println(test2.compute2(2,value -> value * 3 , value -> value * value));

        //System.out.println(test2.compute3(4, 5, (value1, value2) -> value1 + value2));
        //System.out.println(test2.compute3(5, 6, (value1, value2) -> value1 * value2));
        System.out.println(test2.compute4(7, 8, (value1, value2) -> value1 * value2, value -> value + 2));
    }

    private int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.compose(function2).apply(a);
    }

    private int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    private int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(a, b);
    }

    private int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function){
        return biFunction.andThen(function).apply(a, b);
    }
}
