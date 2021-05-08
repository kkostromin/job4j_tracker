package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found in string");
        }
        return rsl;
    }


    public static void main(String[] args) {
        String[] str = new String[] {"E","x","a"};
        String key = "a";
        try {
            int index = indexOf(str, key);
            System.out.println("Индекс элемента " + "'" +  key + "'" +
                    " в массиве строк : " + Integer.toString(index));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
