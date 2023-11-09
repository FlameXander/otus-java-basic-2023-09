package ru.otus.java.basic.lesson12.oop3.boxes;

public class BoxWithItem {
    private int size;
    private Item item;

    public BoxWithItem(int size) {
        this.size = size;
    }

    public void put(Item item) {
        if (item == null) {
            System.out.println("Ай-ай-ай");
            return;
        }
        if (this.item == item) {
            System.out.println("Так он здесь и лежит");
            return;
        }
        if (this.item != null) {
            System.out.println("Нет места");
            return;
        }
        if (item.getSize() > size) {
            System.out.println("Коробка мала");
            return;
        }
        this.item = item;
        System.out.println("Положили в коробку: " + item.getTitle());
    }

    public void clear() {
        if (this.item != null) {
            System.out.println("Выбросили из коробки: " + item.getTitle());
            this.item = null;
        } else {
            System.out.println("Коробка и так пуста");
        }
    }
}
