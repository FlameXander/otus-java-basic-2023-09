package ru.otus.java.basic.lesson11.oop2.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int appetite;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println(name + " " + color);
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    public void sleep() {
        System.out.println(name + " поспал");
    }

    public abstract void voice();

    public void eat() {
        System.out.println(name + " съело кусков еды: " + appetite);
    }
}