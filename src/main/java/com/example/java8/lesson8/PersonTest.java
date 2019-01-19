package com.example.java8.lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/6  15:36
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1,person2,person3);

        PersonTest test = new PersonTest();
        //List<Person> personResult = test.getPersonsByUsername("zhangsan",persons);
        //personResult.forEach(person -> System.out.println(person.getUsername()));

        //List<Person> personResult = test.getPersonsByAge(25,persons);
        //personResult.forEach(person -> System.out.println(person.getAge()));

        List<Person> personResult =
                test.getPersonsByAge2(20, persons, (age, personList) ->{
                    return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
                });

        personResult.forEach(person -> System.out.println(person.getAge()));
        System.out.println("--------------------");
        List<Person> personResult2 =
                test.getPersonsByAge2(20, persons, (age, personList) ->{
                    return personList.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList());
                });
        personResult2.forEach(person -> System.out.println(person.getAge()));
    }

    private List<Person> getPersonsByUsername(String username, List<Person> persons){
        return persons.stream().filter(item -> item.getUsername().equals(username)).
                collect(Collectors.toList());
    }

    private List<Person> getPersonsByAge(int age, List<Person> persons){
        BiFunction<Integer ,List<Person> ,List<Person>> biFunction =
                (ageOfPerson, personList) -> personList.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    private List<Person> getPersonsByAge2(int age, List<Person> persons, BiFunction<Integer,List<Person>, List<Person>> biFunction){
        return biFunction.apply(age, persons);
    }
}
