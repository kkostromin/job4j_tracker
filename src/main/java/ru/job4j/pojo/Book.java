package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberpages;

    public Book(String name, int numberpages){
        this.name = name;
        this.numberpages = numberpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberpages() {
        return numberpages;
    }

    public void setNumberpages(int numberpages) {
        this.numberpages = numberpages;
    }
}
