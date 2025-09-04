package com.guhui.prototype_pattern;

import lombok.Data;
import lombok.ToString;

import java.util.Objects;

/**
 * BelongsProject: Java-learn
 * BelongsPackage: com.guhui.prototype_pattern
 * Author: GuHui
 * CreateTime: 2025-09-04 13:50
 * Version: 1.0
 * 原型模式是根据一个现有对象实例复制出一个新的实例，复制出的类型和属性与原实例相同。
 **/
@Data
@ToString
public class Student implements Cloneable {
    private int id;
    private String name;
    private int score;

    public Object clone() {
        Student std = new Student();
        std.id = this.id;
        std.name = this.name;
        std.score = this.score;
        return std;
    }

    public Student copy() {
        Student std = new Student();
        std.id = this.id;
        std.name = this.name;
        std.score = this.score;
        return std;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(12);
        student.setName("Bob");
        student.setScore(100);
        // 复制新对象:
        Student std2 = (Student) student.clone();
        System.out.println(student);
        System.out.println(std2);
        System.out.println(student.equals(std2)); // false
        Student copy = student.copy();
        System.out.println(student == copy);
    }
}