package com.company;

public class Teacher extends Job {

    public Teacher(int bonus, float salary){
        super(bonus,salary);
        this.jobType = JobType.TEACHER;
    }
}
