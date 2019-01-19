package com.example.java8.lesson29;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @Author: chenglvpeng
 * @Date: 2018/12/13  16:35
 * @Description:
 * @注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>>{
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoker!");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoker!");
        return (set, item) ->{
            System.out.println("accumulator: " + set + ", "+ Thread.currentThread().getName());
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoker!");
        return (set1, set2) -> {
          set1.addAll(set2);
          return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoker!");
        return set -> {
            Map<T, T> map = new HashMap<>();
            set.forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "c", "d", "e", "f", "g");
        Set<String> set = new HashSet<>();
        set.addAll(list);

        System.out.println("set: " + set);

        Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
        System.out.println(map);

    }
}
