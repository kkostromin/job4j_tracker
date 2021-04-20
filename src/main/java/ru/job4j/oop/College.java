package ru.job4j.oop;
/*
3.1. Приведение типов. Повышение типа и понижение типа. [#416718]

Создайте класс ru.job4j.oop.College с методом main.
В нем сделайте приведение объекта Freshman к Student, а потом к Object.
Повышабщее приведение - up casting
 */

public class College {

    public static void main(String[] args) {

        Freshman freshman = new Freshman();

        Student student = freshman;

        Object obj = freshman;
    }

}
