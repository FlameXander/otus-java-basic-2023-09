package ru.otus.java.basic.lesson12.oop3.dogs;

public class Ball {
    private Dog owner;
    private String id;

    public Dog getOwner() {
        return owner;
    }

    public void setOwner(Dog owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public Ball(String id) {
        this.id = id;
    }
}
