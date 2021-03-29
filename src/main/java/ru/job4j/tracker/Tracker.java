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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key){
        int sizefindByName = 0;
        Item[] itemResults = new Item[items.length];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                itemResults[sizefindByName] = item;
                sizefindByName++;
            }
        }
        return itemResults = Arrays.copyOf(itemResults, sizefindByName);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /*public boolean replace(int id, Item item) {
        boolean rsl = false;
        items[indexOf(id)] = item;
        System.out.println("Индекс  id : " + " --- " + items[indexOf(id)].getName());
        return rsl;
    }*/
}