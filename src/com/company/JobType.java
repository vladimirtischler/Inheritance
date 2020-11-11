package com.company;

public class JobType {
    enum JobTypes{
        PROGRAMMER,
        TEACHER,
        DRIVER;
    }

    public JobType(){
        JobTypes.PROGRAMMER.toString().concat("programmer");
        JobTypes.DRIVER.toString().concat("driver");
        JobTypes.TEACHER.toString().concat("teacher");

    }
}
