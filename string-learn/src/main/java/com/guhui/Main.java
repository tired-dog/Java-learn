package com.guhui;

import java.util.Random;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui
 * Author: GuHui
 * CreateTime: 2025-09-05 11:26
 * Version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Random r = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}