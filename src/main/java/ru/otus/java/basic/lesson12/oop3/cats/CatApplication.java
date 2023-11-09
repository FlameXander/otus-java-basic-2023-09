package ru.otus.java.basic.lesson12.oop3.cats;

import java.util.Arrays;

public class CatApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");

        Plate[] plates = {
                new Plate(100),
                new Plate(100),
                new Plate(120),
                new Plate(100)
        };

       cat.eat(plates);

        System.out.println(Arrays.toString(plates));
    }
}
