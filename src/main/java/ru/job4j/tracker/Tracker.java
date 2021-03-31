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
3. Реализуйте метод Tracker.delete, используя indexOf. Причем вызов indexOf должен быть один.
   Метод delete возвращает true, если заявление удалено или false, если index не найдет по id.

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
        return Arrays.copyOf(itemResults, sizefindByName);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
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

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        ids = indexOf(id);
        if (ids != -1) {
            item.setId(id);
            items[ids] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}