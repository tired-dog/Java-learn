package com.guhui.factory_pattern.factory;

import com.guhui.factory_pattern.Shape;
import com.guhui.factory_pattern.impl.Circle;
import com.guhui.factory_pattern.impl.Rectangle;
import com.guhui.factory_pattern.impl.Square;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.factory_pattern.factory
 * Author: GuHui
 * CreateTime: 2025-09-03 14:44
 * Version: 1.0
 **/
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}