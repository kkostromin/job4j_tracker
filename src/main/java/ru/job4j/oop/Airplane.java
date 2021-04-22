package ru.job4j.oop;

public class Airplane implements Vehicle {

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " летает");
    }

    @Override
    public void refuel() {
        System.out.println(getClass().getSimpleName() + " заправляют авиационным керосином");
    }
}
