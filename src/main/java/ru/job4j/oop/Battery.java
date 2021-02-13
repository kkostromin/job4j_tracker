package ru.job4j.oop;

/**
 * 1. Создать класс ru.job4j.oop.Battery. в нем должно быть поле private int load.
 * 2. Создать метод public void exchange(Battery another). Этот метод должен списывать заряд
 * из батареи у кого вызывали метод exchange и добавить к объекту another.
 */
public class Battery {
    private int load;

    public Battery(int value) {
        this.load = value;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(1000);
        Battery second = new Battery(2000);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);

    }
}

