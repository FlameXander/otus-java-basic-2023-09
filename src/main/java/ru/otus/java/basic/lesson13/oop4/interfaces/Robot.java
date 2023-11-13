package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Robot implements Participant {
    private String id;
    private int maxJumpHeight;

    public Robot(String id) {
        this.id = id;
        this.maxJumpHeight = 1000;
    }

    @Override
    public boolean run(int distance) {
        System.out.println("Задача будет выполнена: бег на метров: " + distance);
        return true;
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