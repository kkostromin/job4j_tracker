package ru.job4j.oop;

public class Train implements Vehicle{

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам");
    }

    @Override
    public void refuel() {
        System.out.println(getClass().getSimpleName() + " использует электричество");
    }
}
