package com.example.java8;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","234","345");
        List<Long> longs = list.stream().filter(StringUtils::isNotBlank).
                map(s ->Long.parseLong(s.trim())).collect(Collectors.toList());





        longs.forEach(System.out::println);
    }
}
