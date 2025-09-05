package com.guhui.string;

import java.util.StringJoiner;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.string
 * Author: GuHui
 * CreateTime: 2025-09-05 09:25
 * Version: 1.0
 **/
// 输出: Hello Bob, Alice, Grace!
public class Main {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
        //类似用分隔符拼接数组的需求很常见，所以Java标准库还提供了一个StringJoiner来干这个事：
        String[] name = {"张三", "李四", "王五"};
        var sj = new StringJoiner(",", "Hello ", "!");
        for (String s : name) {
            sj.add(s);
        }
        System.out.println(sj.toString());
        //String还提供了一个静态方法join()，这个方法在内部使用了StringJoiner来拼接字符串，
        // 在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
        String[] strings = {"张三", "李四", "王五"};
        String join = String.join(",", strings);
        System.out.println(join);
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".substring(2)); // "llo"
        System.out.println("Hello".substring(2, 4)); //"ll"
        System.out.println("".isEmpty());// true，因为字符串长度为0
        System.out.println("  ".isEmpty()); // false，因为字符串长度不为0
        System.out.println("  ".isBlank()); // true，因为只包含空白字符
        System.out.println(" Hello ".isBlank()); // false，因为包含非空白字符


    }
}
