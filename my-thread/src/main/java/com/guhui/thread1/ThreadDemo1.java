package com.guhui.thread1;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui
 * Author: GuHui
 * CreateTime: 2025-08-12 14:40
 * Version: 1.0
 **/
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread("坦克");
        //MyThread myThread2 = new MyThread("飞机");

        myThread1.start();
        myThread1.join();
        //myThread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程");
        }


    }
}