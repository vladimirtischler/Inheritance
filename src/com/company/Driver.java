package com.company;

public class Driver extends Job {
    public Driver(int bonus, float salary){
        super(bonus,salary);
        this.jobType = JobType.DRIVER;
    }
}
