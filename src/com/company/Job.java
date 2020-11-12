package com.company;

public class Job {
    int bonus;
    float salary;
    JobType jobType;

    public Job(int bonus, float salary) {
         this.salary = salary;
         this.bonus = bonus;
    }

    public String getInfo(){
        return jobType.value +"´s salary is "+salary+" and bonus is "+bonus;
    }
}
