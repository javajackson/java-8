package com.example.java8.lesson10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/6  17:24
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PredicateTest2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        PredicateTest2 test2 = new PredicateTest2();
        test2.conditionFilter(list, integer -> integer % 2 ==0);
        System.out.println("-------------------------");
        test2.conditionFilter(list, integer -> integer % 2 !=0);
        System.out.println("-------------------------");
        test2.conditionFilter(list, integer -> integer > 5);
        System.out.println("-------------------------");
        test2.conditionFilter(list, integer -> integer < 3);
        System.out.println("-------------------------");
        test2.conditionFilter(list,integer -> true);
        System.out.println("-------------------------");
        test2.conditionFilter(list, integer -> false);
        System.out.println("-------------------------");
        test2.conditionFilter2(list, integer -> integer > 5, integer -> integer % 2 ==0);
        System.out.println("-------------------------");

    }

    private void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for(Integer integer : list){
            if(predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    private void conditionFilter2(List<Integer> list, Predicate<Integer> predicate,
                                  Predicate<Integer> predicate2){
        for(Integer integer : list){
            if(predicate.and(predicate2).negate().test(integer)){
                System.out.println(integer);
            }
        }
    }

    private Predicate<String> isEqual(Object object){
        return Predicate.isEqual(object);
    }
}
