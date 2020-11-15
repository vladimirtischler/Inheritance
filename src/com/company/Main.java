package com.company;

import com.company.model.*;

import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        Teacher teacher = new Teacher(300,900, JobType.TEACHER);
        Programmer programmer = new Programmer(200,1700,JobType.PROGRAMMER);
        Driver driver = new Driver(300,1000,JobType.DRIVER);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        List<Job> people = Arrays.asList(teacher,programmer,driver);

        System.out.println(teacher.getInfo());
        System.out.println(programmer.getInfo());
        System.out.println(driver.getInfo());
        System.out.println(employeeService.getTotalSalary(people));
        System.out.println(employeeService.getTotalBonus(people));
    }
}
