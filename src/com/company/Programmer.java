package com.company;

public class Programmer extends Job {
    public Programmer(int bonus, float salary){
        super(bonus,salary);
        this.jobType = JobType.PROGRAMMER;
    }
}
