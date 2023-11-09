package ru.otus.java.basic.lesson12.oop3.dogs;

public class DogsApp {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Red1");
        Ball ball2 = new Ball("Blue3");

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Strelka");

        dog1.play(ball1);
        dog1.play(ball2);

        dog2.play(ball1);
        dog2.play(ball1);
    }
}
