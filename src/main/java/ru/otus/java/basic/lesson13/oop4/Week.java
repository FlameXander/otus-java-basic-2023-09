package ru.otus.java.basic.lesson13.oop4;

public class Week {
    private int currentDayOfWeek;

    public static final int MONDAY = 1;
    // 2 3 4 5 6 7

    public int getCurrentDayOfWeek() {
        return currentDayOfWeek;
    }

    public void setCurrentDayOfWeek(int currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }

    public Week(int currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }
}
