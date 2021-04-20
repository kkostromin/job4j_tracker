package ru.job4j.poly;

import java.util.SortedMap;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("I am drive");
    }

    @Override
    public void passenger (int countpass) {
        System.out.println("Number of passanger: " + countpass);
    }

    @Override
    public double fuel(double liters) {
        return 0;
    }
}
