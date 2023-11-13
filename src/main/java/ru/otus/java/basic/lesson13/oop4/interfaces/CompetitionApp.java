package ru.otus.java.basic.lesson13.oop4.interfaces;

public class CompetitionApp {
    public static void main(String[] args) {
        Obstacle[] course = {
                new Cross(1000),
                new Wall(50),
                new Cross(8000),
                new Wall(200)
        };
        Participant[] participants = {
                new Human("Bob"),
                new Cat("Barsik"),
                new Robot("R2D2")
        };
        for (Participant p : participants) {
            for (Obstacle o : course) {
                if (!o.doIt(p)) {
                    System.out.println(p.getClass().getSimpleName() + " уходит с дистанции");
                    break;
                }
            }
        }


    }
}
