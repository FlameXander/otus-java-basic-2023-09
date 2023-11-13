package ru.otus.java.basic.lesson13.oop4;

public enum Month {
    JANUARY(Season.WINTER, 1),
    FEBRUARY(Season.WINTER, 2),
    MARCH(Season.SPRING, 3),
    APRIL(Season.SPRING, 4),
    MAY(Season.SPRING, 5),
    JUNE(Season.SUMMER, 6),
    JULY(Season.SUMMER, 7),
    AUGUST(Season.SUMMER, 8),
    SEPTEMBER(Season.AUTUMN, 9),
    OCTOBER(Season.AUTUMN, 10),
    NOVEMBER(Season.AUTUMN, 11),
    DECEMBER(Season.WINTER, 12);

    private Season season;
    private int index;

    public Season getSeason() {
        return season;
    }

    public int getIndex() {
        return index;
    }

    Month(Season season, int index) {
        this.season = season;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Month{" +
                "season=" + season +
                ", index=" + index +
                '}';
    }
}