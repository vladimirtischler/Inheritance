package com.company;

public class Main{

    public static void main(String[] args) {
        Teacher teacher = new Teacher(900,300,JobType.TEACHER);
        Programmer programmer = new Programmer(200,1700,JobType.PROGRAMMER);
        Driver driver = new Driver(300,1000,JobType.DRIVER);

        System.out.println(teacher.getInfo());
        System.out.println(programmer.getInfo());
        System.out.println(driver.getInfo());
    }
}
