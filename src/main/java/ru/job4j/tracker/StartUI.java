package ru.job4j.tracker;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import  java.util.Scanner;

public class StartUI {

      public static void createItem(Input input, Tracker tracker){
         System.out.println("=== Create a new Item ====");
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         tracker.add(item);
      }

      public static void replaceItem(Input input, Tracker tracker) {
         int ids = input.askInt("=== Enter id's item ====>\n");
         String name = input.askStr("=== Enter new item name ====>\n");
         Item itemNew = new Item(name);
         if (tracker.replace(ids, itemNew)) {
            System.out.println("Ok");
         } else {
            System.out.println("Error");
         }
      }

      public static void  deleteItem(Input input, Tracker tracker){
         int ids = input.askInt("=== Enter id's item for delete ====>\n");
         if (tracker.delete(ids)) {
            System.out.println("Ok");
         } else {
            System.out.println("Error");
         }
      }

      public static void  findAllItem(Input input, Tracker tracker){
         System.out.println("=== All items ====>\n");
         Item[] itemRsl = tracker.findAll();
         for(Item item : itemRsl){
            System.out.println(item);
         }
      }

      public static void  findById(Input input, Tracker tracker){
         int ids = input.askInt("=== Enter id's item for search ====>\n");
         Item rstItem = tracker.findById(ids);
         if (rstItem != null) {
            System.out.println("Result : " + "Id name - "+ rstItem.getName());
         } else {
            System.out.println("Item not found");
         }
      }

      public static void  findByName(Input input, Tracker tracker) {
         String name = input.askStr("=== Enter item name for search ====>\n");
         Item[] rstItem = tracker.findByName(name);
         if (rstItem.length > 0) {
            for (Item item : rstItem) {
               System.out.println(item);
            }
         } else {
            System.out.println("Item not found");
         }
      }

      public void init(Input input, Tracker tracker) {
      boolean run = true;
      while (run) {
         this.showMenu();
         System.out.print("Select: ");
         int select = input.askInt("Enter menu item: ");
         if (select == 0) {
            createItem(input, tracker);
         } else if (select == 1) {
            findAllItem(input, tracker);
         } else if (select == 2) {
            replaceItem(input, tracker);
         } else if (select == 3) {
            deleteItem(input, tracker);
         }else if (select == 4) {
            findById(input, tracker);
         }else if (select == 5) {
            findByName(input, tracker);
         }else if (select == 6) {
            run = false;
         }
      }
   }

   private void showMenu() {
      System.out.println(System.lineSeparator() + "Menu:");
      System.out.println("0. Add new Item");
      System.out.println("1. Show all items");
      System.out.println("2. Edit item");
      System.out.println("3. Delete item");
      System.out.println("4. Find item by Id");
      System.out.println("5. Find items by name");
      System.out.println("6. Exit Program");
   }

   public static void main(String[] args) {
      Input input = new ConsoleInput();
      Tracker tracker = new Tracker();
      new StartUI().init(input, tracker);
    }
}
