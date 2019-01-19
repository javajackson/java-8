package com.example.java8.lesson21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/10  17:52
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
        //分组
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);

        Map<String, Long> map1 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(map1);

        Map<String, Double> map2 = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));
        System.out.println(map2);

        //分区 两组 true一组 false一组

        Map<Boolean,List<Student>> map3 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map3);

    }
}
