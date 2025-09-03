package com.guhui.factory_pattern;

import com.guhui.factory_pattern.factory.ShapeFactory;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui
 * Author: GuHui
 * CreateTime: 2025-09-03 14:47
 * Version: 1.0
 **/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}