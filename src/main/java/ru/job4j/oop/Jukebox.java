package ru.job4j.oop;

/**
 * 1. Сделайте класс ru.job4j.oop.Jukebox.
 * 2. Добавьте в него метод public void music(int position).
 * 3. Внутри метода сделайте if else.
 * Если position равно 1, то в консоль должны выводиться слова песни "Пусть бегут неуклюже".
 * Если равно 2, то в консоль должны выводиться слова песни "Спокойной ночи".
 * Во всех остальных случаях должно появиться "Песня не найдена".
 * 4. Напишите метод main с демонстрацией работы этого метода и объекта этого класса.
 */

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("1. Пусть бегут неуклюже");
        }
        else if (position == 2) {
            System.out.println("2. Спокойной ночи");
        }
        else System.out.println("Песня не найдена");
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(3);
    }
}
