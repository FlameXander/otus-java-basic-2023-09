package ru.otus.java.basic.lesson10.oop1;


import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 4, 5.5f);
        Cat cat2 = new Cat("Murzik", "Black", 5, 8.5f);

        cat2 = cat;
        cat.setColor("Purple");
        cat2.setColor("Gray");

        cat.info();
        cat2.info();

        String str = "Java";

        Scanner scanner = new Scanner(System.in);


    }
}
