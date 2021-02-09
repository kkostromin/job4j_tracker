package ru.job4j.oop;

/**
 * 1. Создайте класс ru.job4j.oop.DummyDic.
 * 2. Создайте в нем метод public String engToRus(String eng).
 * 3. Метод должен вернуть строчку "Неизвестное слово. " + eng.
 */

public class DummyDic {

    public String engToRus(String eng){
        String resultText = "Неизвестное слово. " + eng;
        System.out.println(resultText);
        return resultText;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        word.engToRus("sdkg");
    }
}
