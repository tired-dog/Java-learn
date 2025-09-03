package com.guhui.thread4;

import java.util.Objects;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread4
 * Author: GuHui
 * CreateTime: 2025-08-12 15:40
 * Version: 1.0
 **/
public class MyThread extends Thread {
    static int tickets = 0;
    static final Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (tickets < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets++;
                    System.out.println(getName() + "正在卖第" + tickets + "张票");
                } else {
                    break;
                }
            }
        }
    }
}