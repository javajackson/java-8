package com.example.java8.lesson13;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  15:36
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MethodReferenceTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zh aoliu", 40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
//        students.sort((studentParam1,studentParam2) ->
//                Student.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach(student -> System.out.println(student.getScore()));

        System.out.println("----------------");

        students.sort(Student::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));
    }
}
