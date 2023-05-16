package org.example.Models.Printing_Press;

import org.example.Models.Employees.Employee;
import org.example.Models.Employees.Managers;
import org.example.Models.Employees.Operators;
import org.example.Models.Publications.Publications;

import java.util.List;

public class Printing_Press {

    List<Employee> employeeList;
    List<Publications> publicationsList;
    public Integer totalIncome;

    public Double salaryExpenses;

    public Double materialsExpenses;

    public Printing_Press(Integer totalIncome, Double salaryExpenses, Double materialsExpenses, Integer expectedIncome) {
        this.totalIncome = totalIncome;
        this.salaryExpenses = salaryExpenses;
        this.materialsExpenses = materialsExpenses;
        this.expectedIncome = expectedIncome;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Integer getTotalIncome() {
        return totalIncome;
    }

    public Integer getExpectedIncome() {
        return expectedIncome;
    }

    public Integer expectedIncome;

    public Double getMaterialsExpenses() {
        return materialsExpenses;
    }

    public Double getSalaryExpenses() {
        double totalSalary = 0;
        for (Employee employee: this.employeeList
             ) {
            if(employee instanceof Operators){
                totalSalary += employee.getSalary();
            }
            else if (employee instanceof Managers){
                totalSalary += employee.getSalary(this);
            }
        }
        return totalSalary;
    }

    public Double getMaterialExpenses(){
        return this.publicationsList.iterator().next().getPrice();
    }


}
