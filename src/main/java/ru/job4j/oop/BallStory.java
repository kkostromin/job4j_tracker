package ru.job4j.oop;

/**
 * 1. По аналогии с описанным заданием сделать классы для описания сказки колобок.
 * 2. Создайте 4 класса Ball, Hare, Wolf, Fox.
 * 3. В каждом классе должен быть метод public void tryEat(Ball ball).
 * 4. Создайте класс BallStory с методом main и опишите историю через объекты.
 */

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
