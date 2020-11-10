package com.company;

public class Job {

    enum jobType{
        Programmer,
        Teacher,
        Driver;
    }
    int bonus;
    float salary;
    jobType jobType;


    public String getInfo(){
        return jobType+"'s salary is "+salary+" and bonus is "+bonus;
    }
}
