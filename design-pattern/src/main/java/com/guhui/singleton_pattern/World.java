package com.guhui.singleton_pattern;

/**
 * 使用枚举实现Singleton还避免了第一种方式实现Singleton的一个潜在问题：
 * 即序列化和反序列化会绕过普通类的private构造方法从而创建出多个实例，而枚举类就没有这个问题。
 */
public enum World {
    INSTANCE;
    private String name = "world";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String name = World.INSTANCE.getName();
        System.out.println(name);
    }
}
