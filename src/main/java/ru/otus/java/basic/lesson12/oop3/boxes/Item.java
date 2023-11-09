package ru.otus.java.basic.lesson12.oop3.boxes;

public class Item {
    private String title;
    private int size;

    public String getTitle() {
        return title;
    }

    public Item(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
