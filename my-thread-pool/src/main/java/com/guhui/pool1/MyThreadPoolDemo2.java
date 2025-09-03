package com.guhui.pool1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.pool1
 * Author: GuHui
 * CreateTime: 2025-08-12 20:59
 * Version: 1.0
 **/
public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 6, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
        );
        MyRunnable runnable = new MyRunnable();
        pool.submit(runnable);


        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}