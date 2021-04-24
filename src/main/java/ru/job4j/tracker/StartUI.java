package ru.job4j.tracker;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import  java.util.Scanner;

public class StartUI {

      public static void createItem(Input input, Tracker tracker){
         System.out.println("=== Create a new Item ====");
         String msg0 = "Enter name: ";
         String name = input.askStr(msg0);
         Item item = new Item(name);
         tracker.add(item);
      }

      public static void replaceItem(Input input, Tracker tracker) {
         String msg2_1 = "=== Enter id's item ====>\n";
         int ids = input.askInt(msg2_1);
         String msg2_2 = "=== Enter new item name ====>\n";
         String name = input.askStr(msg2_2);
         Item itemNew = new Item(name);
         if (tracker.replace(ids, itemNew)) {
            System.out.println("Ok");
         } else {
            System.out.println("Error");
         }
      }

      public static void  deleteItem(Input input, Tracker tracker){
         String msg3 = "=== Enter id's item for delete ====>\n";
         int ids = input.askInt(msg3);
         if (tracker.delete(ids)) {
            System.out.println("Ok");
         } else {
            System.out.println("Error");
         }
      }


      public void init(Input input, Tracker tracker) {
      boolean run = true;
      while (run) {
         this.showMenu();
         System.out.print("Select: ");
         String msg = "Enter menu item: ";
         int select = Integer.valueOf(input.askInt(msg));
         if (select == 0) {
           createItem(input, tracker);
         } else if (select == 1) {
            System.out.println("=== All items ====>\n");
            Item[] itemRsl = tracker.findAll();
            for(Item item : itemRsl){
               System.out.println(item);
            }
         } else if (select == 2) {
            replaceItem(input, tracker);
         } else if (select == 3) {
          deleteItem(input, tracker);
         }else if (select == 4) {
            String msg4 = "=== Enter id's item for search ====>\n";
            int ids = input.askInt(msg4);
            Item rstItem = tracker.findById(ids);
            if (rstItem != null) {
               System.out.println("Result : " + "Id name - "+ rstItem.getName());
            } else {
               System.out.println("Item not found");
            }
         }else if (select == 5) {
            String msg5 = "=== Enter item name for search ====>\n";
            String name = input.askStr(msg5);
            Item[] rstItem = tracker.findByName(name);
            if (rstItem.length > 0) {
               for(Item item : rstItem){
                  System.out.println(item);
               }
            } else {
               System.out.println("Item not found");
            }
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
       /*     Item item1 = new Item(1, "1111");
       Item item2 = new Item(2, "2222");
       Item item3 = new Item(3, "3333");

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       LocalDateTime itemDate = item1.getDate();

       String itemDateTimeFormat = itemDate.format(formatter);
       System.out.println("Текущие дата и время после форматирования: " + itemDateTimeFormat);
       */
       /*tracker tracker = new Tracker();
       tracker.add(item1);
       tracker.add(item2);
       System.out.println("----FindById-----");
       Item itemResult = tracker.findById(1);
       System.out.println("Item result " + itemResult.getName());
       System.out.println(item3.toString());
      */
      Input input = new ConsoleInput();
      Tracker tracker = new Tracker();
      new StartUI().init(input, tracker);
    }
}
