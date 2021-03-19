package ru.job4j.prof;

public class Dentist extends Doctor{
    private String clinic;
    static Extraction extraction;

    public Dentist(String name, String sername, String education, String birthday, String clinic) {
        super(name, sername, education, birthday);
        this.clinic = clinic;
    }

    public Extraction tooth(Toothnumber toothnumber){
        return extraction;
    }
}
