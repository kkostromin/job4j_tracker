package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int countpass);

    double fuel(double liters);
}
