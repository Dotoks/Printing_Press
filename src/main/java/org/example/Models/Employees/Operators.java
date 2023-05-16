package org.example.Models.Employees;

public class Operators extends Employee {
    @Override
    public Integer getSalary() {
        return super.getSalary();
    }

    public Operators(String name) {
        super(name);
    }
}
