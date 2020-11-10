package com.company;

public class Teacher extends Job {

    public Teacher(int bonus, float salary){
        this.bonus = bonus;
        this.salary = salary;
        this.jobType = jobType.Teacher;
    }
}
