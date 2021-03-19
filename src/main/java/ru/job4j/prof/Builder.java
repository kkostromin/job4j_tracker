package ru.job4j.prof;

public class Builder extends Engineer{
    static Constraction constraction;
    private String category;

     public Builder(String name, String sername, String education, String birthday, String category){
         super(name, sername, education, birthday);
         this.category = category;
    }

    public Constraction building (House house){
        return constraction;
    }
}
