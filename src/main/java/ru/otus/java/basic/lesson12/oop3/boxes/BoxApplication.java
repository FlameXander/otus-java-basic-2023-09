package ru.otus.java.basic.lesson12.oop3.boxes;

public class BoxApplication {
    public static void main(String[] args) {
        BoxWithItem box = new BoxWithItem(10);

        Item item1 = new Item("Ball", 5);
        Item item2 = new Item("Maul", 20);

        box.put(item2);
        box.put(item1);
        box.clear();
    }
}
