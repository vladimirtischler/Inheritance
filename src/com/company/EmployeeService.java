package com.company;

import com.company.model.Job;

import java.util.List;

interface EmployeService {
    double getTotalSalary(List<Job> jobs);
    int getTotalBonus(List<Job> jobs);
}
