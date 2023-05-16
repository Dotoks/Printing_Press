package org.example.Models.Employees;

import org.example.Models.Printing_Press.Printing_Press;
public abstract class Employee {
    public Employee(String name) {
        this.name = name;
    }

    public Double salary = 1000.0;
    public String name;

    public Double getSalary(){
        return this.salary;
    }
    public Double getSalary(Printing_Press printingPress){
        return this.salary;
    }

    public String getName() {
        return name;
    }
}
