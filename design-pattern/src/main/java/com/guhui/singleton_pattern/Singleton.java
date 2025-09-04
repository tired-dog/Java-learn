package com.guhui.singleton_pattern;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.singleton_pattern
 * Author: GuHui
 * CreateTime: 2025-09-04 10:43
 * Version: 1.0
 * 只有private构造方法，确保外部无法实例化；
 * 通过private static变量持有唯一实例，保证全局唯一性；
 * 通过public static方法返回此唯一实例，使外部调用方能获取到实例。
 **/
public class Singleton {
    //静态字段引用唯一实例
    private static final Singleton INSTANCE = new Singleton();

    //通过静态方法返回实例
    public static Singleton getInstance() {
        return INSTANCE;
    }

    //private构造方法保证外部无法实例化
    private Singleton() {

    }
}