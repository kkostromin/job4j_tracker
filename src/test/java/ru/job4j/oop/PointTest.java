package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void testDistance3D() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 3, 5);
        double rsl = a.distance3D(b);
        assertThat(rsl, closeTo(4.242, 0.001));
    }
}