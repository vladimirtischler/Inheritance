package com.company.model;

public class Job {
    int bonus;
    float salary;
    JobType jobType;

    public Job(int bonus, float salary, JobType jobType) {
         this.salary = salary;
         this.bonus = bonus;
         this.jobType = jobType;
    }

    public String getInfo(){
        return jobType.value +"´s salary is "+salary+" and bonus is "+bonus+".";
    }

    public int getBonus() {
        return bonus;
    }

    public float getSalary() {
        return salary;
    }
}
