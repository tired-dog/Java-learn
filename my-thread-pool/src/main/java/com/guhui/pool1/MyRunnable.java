package com.guhui.pool1;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.pool1
 * Author: GuHui
 * CreateTime: 2025-08-12 17:08
 * Version: 1.0
 **/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----");
    }
}