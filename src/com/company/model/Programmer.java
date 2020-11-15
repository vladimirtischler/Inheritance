package com.company.model;

import com.company.model.Job;
import com.company.model.JobType;

public class Programmer extends Job {
    public Programmer(int bonus, float salary, JobType jobType) {
        super(bonus, salary, jobType);
    }

    @Override
    public String getInfo(){
        return jobType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
