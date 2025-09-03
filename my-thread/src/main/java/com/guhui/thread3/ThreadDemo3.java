package com.guhui.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * BelongsProject: Java_learn
 * BelongsPackage: com.guhui.thread3
 * Author: GuHui
 * CreateTime: 2025-08-12 14:58
 * Version: 1.0
 **/
public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.start();
        Integer i = task.get();
        System.out.println(i);
    }
}