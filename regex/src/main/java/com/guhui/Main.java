package com.guhui;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui
 * Author: GuHui
 * CreateTime: 2025-09-05 14:03
 * Version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        String re2 = "a\\&c"; // 对应的正则是a\&c
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));
    }
}