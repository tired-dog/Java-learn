package com.guhui.decorator_pattern;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.decorator_pattern
 * Author: GuHui
 * CreateTime: 2025-09-04 14:48
 * Version: 1.0
 * 抽象的Decorator类
 **/
public abstract class NodeDecorator implements TextNode {
    protected final TextNode target;

    protected NodeDecorator(TextNode target) {
        this.target = target;
    }

    @Override
    public void setText(String text) {
        this.target.setText(text);
    }
}