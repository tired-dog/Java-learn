package com.guhui.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.stream
 * Author: GuHui
 * CreateTime: 2025-08-27 09:35
 * Version: 1.0
 **/
public class Stream1 {
    public static void main(String[] args) {
        //从集合创建stream
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream1 = list.stream();
        System.out.println(stream1.filter(s -> s > 1).toList());
        List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7);
        //System.out.println(Arrays.toString(list1.toArray()));
        list1.forEach(System.out::print);
        //从数组创建stream
        String[] a1 = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(a1);
        //使用stream.of
        Stream<String> stream3 = Stream.of("a", "c", "x");
        stream3.map(String::toUpperCase).forEach(System.out::println);
        record User(String name, int age) {
        }
        List<User> users = List.of(new User("Alice", 21), new User("Bob", 25));
        List<String> names = users.stream()
                .map(User::name)
                .toList();   // Java 16+
        names.forEach(name -> System.out.print(name + " "));
        List<User> user = List.of(new User("Bob", 12));
        user.stream().map(User::age).forEach(System.out::println);
    }
}