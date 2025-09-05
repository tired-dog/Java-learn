package com.guhui.stringbuilder;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.stringbuilder
 * Author: GuHui
 * CreateTime: 2025-09-05 10:07
 * Version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(',');
        }
        System.out.println(sb.toString());
        var stringBuilder = new StringBuilder(1024);
        stringBuilder.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(stringBuilder.toString());
        int i = 100;
        Integer i1 = Integer.valueOf(i);
        int i3 = i1.intValue();
        Integer i2 = Integer.valueOf("100");

    }
}