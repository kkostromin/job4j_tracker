package ru.job4j.oop;

/**
 * 1. Создайте дополнительное поле private String name. Это поле должно содержать кличку котика.
 * 2. Создайте метод public void giveNick(String nick). Этот метод должен записывать переменную nick в поле name.
 * 3. Измените метод void show() так, чтобы при его вызове в консоль выводилась информация: имя котика и что он ел.
 */
public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}
