package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

/*
В этом задании нужно реализовать предсказателя. Пользователь вводит вопрос,
программа генерирует случайное число и выводит ответ на вопрос пользователя:
да, нет, может быть.
 */
public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? :");
        String question = input.nextLine();
        Scanner strAnswer = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        switch (answer) {
            case (0):
                System.out.print("Да");
                break;
            case (1):
                System.out.print("Нет");
                break;
            case (2):
                System.out.print("Может быть");
                break;
        }
    }
}
