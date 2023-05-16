package org.example.Models.Employees;

import org.example.Models.Printing_Press.Printing_Press;

public class Managers extends Employee {

    public Managers(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Double getSalary(Printing_Press printingPress) {
        if(printingPress.totalIncome > printingPress.expectedIncome){
            return (super.getSalary() * 0.1) + super.getSalary();
        }
        return super.getSalary();
    }
}
