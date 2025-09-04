package com.guhui.decorator_pattern;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.decorator_pattern
 * Author: GuHui
 * CreateTime: 2025-09-04 14:59
 * Version: 1.0
 **/
public class BoldDecorator extends NodeDecorator {
    public BoldDecorator(TextNode target) {
        super(target);
    }

    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }

    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new SpanNode());
        n1.setText("Hello");
        n2.setText("Decorated");
        System.out.println(n1.getText());
        System.out.println(n2.getText());
    }
}
