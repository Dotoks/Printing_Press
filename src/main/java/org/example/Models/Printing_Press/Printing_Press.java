package org.example.Models.Printing_Press;

import org.example.Enums.PageSize;
import org.example.Enums.PaperType;
import org.example.Models.Employees.Employee;
import org.example.Models.Employees.Managers;
import org.example.Models.Employees.Operators;
import org.example.Models.Publications.Publications;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Printing_Press {

    Set<Employee> employeeList;
    List<Publications> publicationsList;
    List<Printing_Machine> printingMachines;

    public String name;
    public Integer totalIncome;

    public Double salaryExpenses;

    public Double materialsExpenses;

    public Integer paperBought;

    public Double paperExpenses;

    public Integer goalPerDay;

    public Printing_Press(String name, Integer totalIncome,  Integer expectedIncome, Integer paperBought, Integer goalPerDay) {
        this.name = name;
        this.totalIncome = totalIncome;
        this.expectedIncome = expectedIncome;
        this.paperBought = paperBought;
        this.goalPerDay = goalPerDay;
        this.publicationsList = new ArrayList<>();
        this.employeeList = new HashSet<>();
        this.printingMachines = new ArrayList<>();
        this.paperExpenses = 0.0;
    }

    public void addEmployee(Employee e){
        employeeList.add(e);
    }


    public Set<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addPublication(Publications publication){
        publicationsList.add(publication);
    }

    public Integer getTotalIncome() {
        return totalIncome;
    }

    public void buyPaper(Integer totalPaper, PaperType paperType, PageSize pageSize){
        this.paperBought += totalPaper;

        this.paperExpenses += totalPaper * paperType.getPrice(pageSize);
    }

    public Integer getExpectedIncome() {
        return expectedIncome;
    }

    public Double getPrintingPressIncome(){
        double income = 0;
        int publicationsBought = 0;
        for (Publications publication:
             this.publicationsList) {
            publicationsBought++;
            if(publicationsBought > goalPerDay){
                income += publication.getPrice() * 0.9;
            }
            else{
                income += publication.getPrice();
            }


        }
        return income;
    }

    public Integer expectedIncome;

    public Double getPaperExpenses() {
        return this.paperExpenses;
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

    public List<Publications> getPublicationsList() {
        return publicationsList;
    }

    public void addPrintingMachine(Printing_Machine printingMachine){
        this.printingMachines.add(printingMachine);
    }
    public List<Printing_Machine> getPrintingMachines() {
        return this.printingMachines;
    }
}
