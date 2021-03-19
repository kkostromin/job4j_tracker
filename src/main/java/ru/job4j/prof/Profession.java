package ru.job4j.prof;

public class Profession {
    private String name;
    private String sername;
    private String education;
    private String birthday;

    public Profession(){
    }

    public Profession(String name, String sername, String education, String birthday) {
        this.name = name;
        this.sername = sername;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName(){
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }

    public String getSername() {
        return sername;
    }
}
