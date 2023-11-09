package ru.otus.java.basic.lesson10.oop1;

public class Cat {
    private String name;
    private String color;
    private int age;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cat(String name, String color, int age, float weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 1;
        this.weight = 1.0f;
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    public void info() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }

    public void eat(float foodAmount) {
        weight += foodAmount * 0.02f;
    }

    public void sleep() {
        weight -= 0.01f;
    }
}
