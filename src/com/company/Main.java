package com.company;

public class Main{

    public static void main(String[] args) {
        Teacher teacher = new Teacher(900,300);
        Programmer programmer = new Programmer(200,1700);

        System.out.println(teacher.getInfo());
        System.out.println(programmer.getInfo());
    }
}
