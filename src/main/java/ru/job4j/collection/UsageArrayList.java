package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> colls = new ArrayList<>();
        colls.add("Petr");
        colls.add("Ivan");
        colls.add("Stepan");
        for (String coll : colls) {
            System.out.println(coll);
        }
    }
}
