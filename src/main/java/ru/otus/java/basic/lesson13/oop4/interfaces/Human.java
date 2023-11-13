package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeight = 100;
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
        if (height <= maxJumpHeight) {
            System.out.println(getClass().getSimpleName() + " перепрыгнул стену высотой " + height + " см.");
            return true;
        }
        System.out.println(getClass().getSimpleName() + " не смог перепрыгнуть стену высотой " + height + " см.");
        return false;
    }
}