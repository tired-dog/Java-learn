package com.guhui.factory_pattern.impl;

import com.guhui.factory_pattern.Shape;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.factory.impl
 * Author: GuHui
 * CreateTime: 2025-09-03 14:41
 * Version: 1.0
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}