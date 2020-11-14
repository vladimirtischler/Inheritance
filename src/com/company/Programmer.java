package com.company;

public class Programmer extends Job {
    public Programmer(int bonus, float salary, JobType jobType) {
        super(bonus, salary, jobType);
    }

    @Override
    public String getInfo(){
        return jobType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
