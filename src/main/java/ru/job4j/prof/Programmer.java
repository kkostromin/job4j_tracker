package ru.job4j.prof;

public class Programmer extends Engineer{
    static Programming programme;
    private String seniority;

    public Programmer(String name, String sername, String education, String birthday, String seniority){
       super(name, sername, education, birthday);
       this.seniority = seniority;
    }

    public Programming programm (Language language){
        return programme;
    }
}
