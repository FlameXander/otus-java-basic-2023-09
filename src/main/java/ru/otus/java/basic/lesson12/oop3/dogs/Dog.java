package ru.otus.java.basic.lesson12.oop3.dogs;

public class Dog {
    private String name;
    private Ball toy;

    public Dog(String name) {
        this.name = name;
    }

    public void play(Ball ball) {
        if (ball.getOwner() == null) {
            if (toy != null) {
                System.out.println(name + " перестает играть с " + toy.getId());
                toy.setOwner(null);
            }
            System.out.println(name + " играет с " + ball.getId());
            ball.setOwner(this);
            toy = ball;
            return;
        }
        if (ball.getOwner() != null) {
            if (this == ball.getOwner()) {
                System.out.println(name + " уже играет с этой игрушкой");
                return;
            }
            System.out.println("Как-то боязно");
        }
    }
}
