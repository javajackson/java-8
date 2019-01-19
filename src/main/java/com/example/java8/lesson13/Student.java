package com.example.java8.lesson13;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/7  14:51
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Student {

    private String name;

    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareStudentByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName(Student student1, Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
