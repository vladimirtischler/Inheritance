package com.company.model;

import com.company.model.Job;
import com.company.model.JobType;

public class Programmer extends Job {
    public Programmer(int bonus, float salary ) {
        super(bonus, salary, JobType.PROGRAMMER);
    }

    @Override
    public String getInfo(){
        return jobType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
