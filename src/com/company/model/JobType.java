package com.company.model;

public enum  JobType {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    String value;
    JobType(String value){
        this.value = value;
    }
}