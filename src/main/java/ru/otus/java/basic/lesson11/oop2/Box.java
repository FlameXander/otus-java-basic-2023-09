package ru.otus.java.basic.lesson11.oop2;

import java.util.Objects;

public class Box {
    private String color;
    private int size;
    private boolean isOpened;

    public Box(String color, int size, boolean isOpened) {
        this.color = color;
        this.size = size;
        this.isOpened = isOpened;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return size == box.size && color.equals(box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }

    @Override
    public String toString() {
        return "Box " + size;
    }
}
