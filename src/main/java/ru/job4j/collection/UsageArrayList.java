package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> coll = new ArrayList<String>();
        coll.add("Petr");
        coll.add("Ivan");
        coll.add("Stepan");
        for (Object value : coll) {
            System.out.println(value);
        }
    }
}
