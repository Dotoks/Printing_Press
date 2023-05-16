package org.example.Models.Employees;

public abstract class Employee {
    public Employee(String name) {
        this.name = name;
    }

    public Integer salary = 1000;
    public String name;

    public Integer getSalary(){
        return this.salary;
    }

    public String getName() {
        return name;
    }
}
