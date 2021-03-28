package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
       Item item = new Item(0, "1111");
       Item item2 = new Item(1, "2222");

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       LocalDateTime itemDate = item.getDate();

       String itemDateTimeFormat = itemDate.format(formatter);
       System.out.println("Текущие дата и время после форматирования: " + itemDateTimeFormat);

       Tracker tracker = new Tracker();
       tracker.add(item);
       tracker.add(item2);
       System.out.println("----FindById-----");
       tracker.findById(1);
       System.out.println("----FindAll-----");
       tracker.findAll();
       System.out.println("----FindByName-----");
       tracker.findByName("2222");

    }
}
