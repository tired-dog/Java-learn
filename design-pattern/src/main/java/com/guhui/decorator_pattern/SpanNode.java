package com.guhui.decorator_pattern;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.decorator_pattern
 * Author: GuHui
 * CreateTime: 2025-09-04 14:44
 * Version: 1.0
 **/
public class SpanNode implements TextNode {
    String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}