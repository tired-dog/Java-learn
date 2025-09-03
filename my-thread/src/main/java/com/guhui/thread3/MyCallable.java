package com.guhui.thread3;

import java.util.concurrent.Callable;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread3
 * Author: GuHui
 * CreateTime: 2025-08-12 15:06
 * Version: 1.0
 **/
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}