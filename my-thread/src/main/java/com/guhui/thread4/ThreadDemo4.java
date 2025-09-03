package com.guhui.thread4;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread4
 * Author: GuHui
 * CreateTime: 2025-08-12 15:14
 * Version: 1.0
 **/
public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}