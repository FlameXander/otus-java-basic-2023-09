package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Cat implements Participant {
    private String name;
    private String color;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name) {
        this.name = name;
        this.color = "White";
        this.maxRunDistance = 1000;
        this.maxJumpHeight = 300;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м.");
            return true;
        }
        System.out.println(getClass().getSimpleName() + " не смог пробежать " + distance + " м.");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight * (1 + Math.random() * 0.2f)) {
            System.out.println(getClass().getSimpleName() + " перепрыгнул стену высотой " + height + " см.");
            return true;
        }
        System.out.println(getClass().getSimpleName() + " не смог перепрыгнуть стену высотой " + height + " см.");
        return false;
    }
}