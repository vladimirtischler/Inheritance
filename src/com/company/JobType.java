package com.company;

public class JobType {
    enum JobTypes{
        PROGRAMMER{
            public String toString(){
                return "Programmer´s";
            }
        },
        TEACHER{
            public String toString(){
                return "Teacher´s";
            }
        },
        DRIVER{
            public String toString(){
                return "Driver´s";
            }
        };
    }

    //public JobType(){
    //    JobTypes.PROGRAMMER.toString().concat("programmer");
    //    JobTypes.DRIVER.toString().concat("driver");
    //    JobTypes.TEACHER.toString().concat("teacher");

    //}
}
