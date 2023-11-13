package ru.otus.java.basic.lesson13.oop4;

public class Cat {
    private String name;
    private String color;
    public static int age;

    public static final int PAWS_COUNT = 4;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }
}