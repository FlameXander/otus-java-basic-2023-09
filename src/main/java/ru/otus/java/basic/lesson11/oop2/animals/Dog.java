package ru.otus.java.basic.lesson11.oop2.animals;

public class Dog extends Animal {
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.appetite = 20;
    }

    @Override
    public void voice() {
        System.out.println(name + " гавкнул");
    }
}
