package com.company;

public class Teacher {
    int bonus;
    float salary;

    public Teacher(int bonus, float salary){
        this.bonus = bonus;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus(int bonus) {
        return bonus;
    }

    public String getInfo(){
        return "Programmer’s salary is " + salary + " and bonus is " + bonus;
    }
}
