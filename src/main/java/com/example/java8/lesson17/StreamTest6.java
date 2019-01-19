package com.example.java8.lesson17;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  10:12
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest6 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        stream.findFirst().ifPresent(System.out::println);

        Stream<Integer> stream = Stream.iterate(1,item -> item + 2).limit(6);
//        System.out.println(stream.filter(item -> item > 2 ).mapToInt(item -> item * 2).skip(2)
//                .limit(2).sum());
        IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 200 ).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getSum());
    }
}
