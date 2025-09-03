package com.guhui.factory_pattern.impl;

import com.guhui.factory_pattern.Shape;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.factory.impl
 * Author: GuHui
 * CreateTime: 2025-09-03 14:40
 * Version: 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}