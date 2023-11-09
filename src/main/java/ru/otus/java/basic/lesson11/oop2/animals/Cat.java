package ru.otus.java.basic.lesson11.oop2.animals;

public class Cat extends Animal {
    int catParameter;

    public Cat(String name, String color, int catParameter) {
        this.name = name;
        this.color = color;
        this.catParameter = catParameter;
        this.appetite = 10;
    }

    @Override
    public void voice() {
        System.out.println(name + " мяукнул");
    }

    public void jumpOnTree() {
        System.out.println(name + " забрался на дерево");
    }
}
