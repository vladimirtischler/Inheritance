package com.company.model;

import com.company.model.Job;
import com.company.model.JobType;

public class Teacher extends Job {

    public Teacher(int bonus, float salary){
        super(bonus,salary,JobType.TEACHER);
    }
}
