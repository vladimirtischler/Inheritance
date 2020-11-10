package com.company;

public abstract class Job {
    int bonus;
    float salary;

    public Job(int bonus, float salary){
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
        return "";
    };
}
