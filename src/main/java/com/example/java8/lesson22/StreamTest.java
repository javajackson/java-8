package com.example.java8.lesson22;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/11  09:31
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        Student student5 = new Student("zhaoliu",90);
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        List<Student> students1 = students.stream().collect(Collectors.toList());
        students1.forEach(System.out::println);
        System.out.println("--------------------");

        System.out.println("count:" + students.stream().collect(Collectors.counting()));
        System.out.println("count:" + students.stream().count());
        System.out.println("--------------------");

        students.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println("--------------------");

        students.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println("--------------------");

        System.out.println(students.stream().collect(Collectors.averagingInt(Student::getScore)));
        System.out.println("--------------------");

        System.out.println(students.stream().collect(Collectors.summingInt(Student::getScore)));
        System.out.println("--------------------");

        IntSummaryStatistics intSummaryStatistics = students.stream().collect(Collectors.summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics);
        System.out.println("--------------------");

        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(", ", "<begin>", "<end>")));
        System.out.println("--------------------");

        Map<Integer,Map<String,List<Student>>> map = students.stream ().collect(Collectors.groupingBy(Student::getScore,Collectors.groupingBy(Student::getName)));
        System.out.println(map);
        System.out.println("--------------------");

        Map<Boolean,List<Student>> map1 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80));
        System.out.println(map1);
        System.out.println("--------------------");

        Map<Boolean,Map<Boolean,List<Student>>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >80 ,Collectors.partitioningBy(student -> student.getScore() > 90)));
        System.out.println(map2);
        System.out.println("--------------------");

        Map<Boolean,Long> map3 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80,Collectors.counting()));
        System.out.println(map3);
        System.out.println("--------------------");

        Map<String, Student> map4 = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Student::getScore)),Optional::get)));
        System.out.println(map4);
    }
}
