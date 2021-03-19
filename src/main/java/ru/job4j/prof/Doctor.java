package ru.job4j.prof;

public class Doctor extends Profession{

    private String clinic;
    
    public Doctor(String name, String sername, String education, String birthday, String clinic) {
        super(name, sername, education, birthday);
        this.clinic = clinic;
    }
    
    public Doctor(String name, String sername, String education, String birthday) {
        super(name, sername, education, birthday);
    }
    
    
}
