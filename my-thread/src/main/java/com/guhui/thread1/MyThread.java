package com.guhui.thread1;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui
 * Author: GuHui
 * CreateTime: 2025-08-12 14:42
 * Version: 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello");
        }
    }

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
}