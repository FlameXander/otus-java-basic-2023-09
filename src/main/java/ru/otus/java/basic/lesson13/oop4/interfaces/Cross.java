package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Cross implements Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Participant participant) {
        return participant.run(length);
    }
}
