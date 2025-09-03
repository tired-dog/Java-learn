package com.guhui.thread2;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread2
 * Author: GuHui
 * CreateTime: 2025-08-12 14:51
 * Version: 1.0
 **/
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();

    }
}