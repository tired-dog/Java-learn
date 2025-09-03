package com.guhui.thread2;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread2
 * Author: GuHui
 * CreateTime: 2025-08-12 14:52
 * Version: 1.0
 **/
public class MyRun implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + "hello");
        }
    }
}