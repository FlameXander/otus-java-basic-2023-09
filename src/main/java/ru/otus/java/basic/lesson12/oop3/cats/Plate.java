package ru.otus.java.basic.lesson12.oop3.cats;

public class Plate {
    private int food;

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }

    public int getFood() {
        return food;
    }
}
