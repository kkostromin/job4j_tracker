package ru.job4j.tracker;

import java.util.Arrays;

/*

1. Добавьте недостающие методы в класс Tracker. В классе Tracker должны быть методы:
добавление заявок - public Item add(Item item);
получение списка всех заявок - public Item[] findAll();
получение списка по имени - public Item[] findByName(String key);
получение заявки по id - public Item findById(int id);
2. Создайте класс ru.job4j.tracker.StartUI. В нем создайте метод main.
    Внутри метода main создайте объект Tracker. Вызовите у него метод add с объектом Item.
    Вызовите метод findById и найденный Item выведите на консоль.
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        int size = 0;
        Item[] itemWithoutNull = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                itemWithoutNull[size] = item;
                size++;
            }
        }
        itemWithoutNull = Arrays.copyOf(itemWithoutNull, size);
        for (int index = 0; index < itemWithoutNull.length; index++) {
            System.out.println("Запись с id : " + index + " --- " + itemWithoutNull[index].getName());
        }
        return itemWithoutNull;
    }

    public Item[] findByName(String key){
        int size = 0;
        String str = "";
        Item[] itemResults = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            try {
                str = item.getName();
                if (str.equals(key)) {
                    itemResults[size] = item;
                    size++;
                }
            }
            catch (NullPointerException e){
                //System.out.println(" item is null ");
            }
        }
        itemResults = Arrays.copyOf(itemResults, size);
        for (int index = 0; index < size; index++) {
            System.out.println("Запись : " + " --- " + itemResults[index].getName());
        }
        return itemResults;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                System.out.println("Запись с id : " + id + " --- " + item.getName());
                break;
            }
        }
        return rsl;
    }
}