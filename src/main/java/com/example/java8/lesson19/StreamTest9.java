package com.example.java8.lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  15:10
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for(int i = 0;i < 5000000; i++){
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");

        long startTime = System.nanoTime();

        list.parallelStream().sorted().count();
        long endTime = System.nanoTime();

        long mills = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时：" + mills);
    }
}
