package com.example.java8.lesson6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/5  20:10
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhuliu");

        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);*/

        /*Collections.sort(names,(String o1,String o2)->{
            return o2.compareTo(o1);
        });
        System.out.println(names);*/

        /*Collections.sort(names,( o1, o2)->{
            return o2.compareTo(o1);
        });
        System.out.println(names);*/

        Collections.sort(names,(o1, o2)-> o2.compareTo(o1));
        System.out.println(names);
    }
}
