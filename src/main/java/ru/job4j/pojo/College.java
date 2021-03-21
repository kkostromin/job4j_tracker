package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setGroup("1B");
        student.setDateOfEntrance("21.08.2020");

        System.out.println(student.getFio() + " stady at group - " + student.getGroup() + " from " + student.getDateOfEntrance());
    }
}
