package ru.job4j.prof;

public class Engineer extends Profession{
    private String qualifications;

    public Engineer(String name, String sername, String education, String birthday) {
        super(name, sername, education, birthday);
    }

    public Engineer(String name, String sername, String education, String birthday, String qualifications ){
        super(name, sername, education, birthday);
        this.qualifications = qualifications;
    }
}
