package com.guhui.pool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.pool1
 * Author: GuHui
 * CreateTime: 2025-08-12 17:06
 * Version: 1.0
 **/
public class MyThreadPoolDemo1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool1 = Executors.newCachedThreadPool();
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.submit(new MyRunnable());
        Thread.sleep(1000);
        pool1.shutdown();
    }
}