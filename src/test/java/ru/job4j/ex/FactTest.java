package ru.job4j.ex;

import org.junit.Test;

public class FactTest{

    @Test(expected = IllegalArgumentException.class)
    public void testCalcWithNegativeParam() {
        Fact fact = new Fact();
        int rsl = fact.calc(-1);
    }
}