package com.company;

public class Job {
    int bonus;
    float salary;
    JobType.JobTypes jobType;

    public Job(int bonus, float salary) {
         this.salary = salary;
         this.bonus = bonus;
    }

    public String getInfo(){
        return jobType +" salary is "+salary+" and bonus is "+bonus;
    }
}
