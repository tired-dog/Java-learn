package com.guhui.stream;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.stream
 * Author: GuHui
 * CreateTime: 2025-09-02 10:05
 * Version: 1.0
 **/
public class Stream2 {
    public static void main(String[] args) {
        List<String> lines = List.of("a,b", "c,d");
        lines.stream()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .collect(Collectors.toSet());
        System.out.println(lines);
    }
}