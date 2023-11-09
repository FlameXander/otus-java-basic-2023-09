package ru.otus.java.basic.lesson12.oop3;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
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
        return size * 27 + color.hashCode();
    }

    @Override
    public String toString() {
        return "Box: " + color + " " + size;
    }
}
