package ru.otus.java.basic.lesson11.oop2;

import ru.otus.java.basic.lesson11.oop2.animals.Animal;
import ru.otus.java.basic.lesson11.oop2.animals.Cat;
import ru.otus.java.basic.lesson11.oop2.animals.Dog;

import java.util.Objects;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 5);
        Dog dog = new Dog("Bobik", "Black");

        cat.voice();
        dog.voice();

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));

        Box box1 = new Box("Red", 10, true);
        Box box2 = new Box("Red", 10, false);

        System.out.println(box1);

        System.out.println(box1.equals(box2));

        Animal a = new Cat("Barsik2", "White", 10);




    }
}
