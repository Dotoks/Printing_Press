package org.example.Models.Employees;

public class Managers extends Employee {
    public Managers(String name) {
        super(name);
    }

    @Override
    public Integer getSalary() {
        return super.getSalary(); // TODO: add additional profit when the income is above a threshold
    }
}
