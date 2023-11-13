package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Participant participant) {
        return participant.jump(height);
    }
}
