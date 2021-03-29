package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
       Item item1 = new Item(1, "1111");
       Item item2 = new Item(2, "2222");

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       LocalDateTime itemDate = item1.getDate();

       String itemDateTimeFormat = itemDate.format(formatter);
       System.out.println("Текущие дата и время после форматирования: " + itemDateTimeFormat);

       Tracker tracker = new Tracker();
       tracker.add(item1);
       tracker.add(item2);
       System.out.println("----FindById-----");
       Item itemResult = tracker.findById(1);
       System.out.println("Item result " + itemResult.getName());
       tracker.findAll();
       tracker.findByName("1111");

    }
}
