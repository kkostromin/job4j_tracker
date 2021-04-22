package ru.job4j.oop;

public class Bus implements Vehicle{

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " ездит по дорогам");
    }

    @Override
    public void refuel() {
        System.out.println(getClass().getSimpleName() + " заправляется дизельным топливом");
    }
}
