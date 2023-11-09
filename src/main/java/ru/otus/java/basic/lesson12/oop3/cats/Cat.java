package ru.otus.java.basic.lesson12.oop3.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        System.out.println("Кот поел");
        plate.decreaseFood(5);
    }

    public void eat(Plate[] plates) {
        Plate targetPlate = plates[0];
        for (int i = 1; i < plates.length; i++) {
            if (plates[i].getFood() > targetPlate.getFood()) {
                targetPlate = plates[i];
            }
        }
        System.out.println("Кот поел");
        targetPlate.decreaseFood(5);
    }

    public void info() {
        System.out.println(name);
    }
}
