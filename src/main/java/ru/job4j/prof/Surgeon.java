package ru.job4j.prof;

public class Surgeon extends Doctor {
    private String clinic;
    private Operation operation;

    public Surgeon(String name, String sername, String education, String birthday, String clinic) {
        super(name, sername, education, birthday);
        this.clinic = clinic;
    }

    public Operation remove(Bodypart bodypart) {
        return operation;
    }
}
