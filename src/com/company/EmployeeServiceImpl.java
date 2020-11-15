package com.company;

import com.company.model.Job;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeService {

    @Override
    public double getTotalSalary(List<Job>jobs) {
       return jobs.stream().mapToDouble(Job::getSalary).sum();
    }

    @Override
    public int getTotalBonus(List<Job>jobs) {
        return jobs.stream().mapToInt(Job::getBonus).sum();
    }
}
