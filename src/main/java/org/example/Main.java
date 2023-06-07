package org.example;

import org.example.Enums.PageSize;
import org.example.Enums.PaperColor;
import org.example.Enums.PaperType;
import org.example.Models.Employees.Employee;
import org.example.Models.Employees.Managers;
import org.example.Models.Employees.Operators;
import org.example.Models.Printing_Press.Printing_Machine;
import org.example.Models.Printing_Press.Printing_Press;
import org.example.Models.Publications.Publications;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printing_Press printingPress = new Printing_Press("BTV", 100000, 10000, 500, 10);

        Publications book1 = new Publications("My Book 1", PaperType.NORMAL, 100, PageSize.A4);
        Publications book2 = new Publications("My Book 2", PaperType.GLOSSY, 200, PageSize.A2);
        Publications book3 = new Publications("Under the Glo", PaperType.GLOSSY, 536, PageSize.A1);
        Publications book4 = new Publications("Java Intro", PaperType.NEWSPAPER, 750, PageSize.A4);

        printingPress.addPublication(book1);
        printingPress.addPublication(book2);
        printingPress.addPublication(book3);
        printingPress.addPublication(book4);

        System.out.println(printingPress.getPrintingPressIncome());

        Managers manager = new Managers("John Doe");
        Managers manager2 = new Managers("Ivan Ivanov");
        Operators operator = new Operators("John Doe2");

        printingPress.addEmployee(manager);
        printingPress.addEmployee(manager2);
        printingPress.addEmployee(operator);

        System.out.println(printingPress.getSalaryExpenses());

        System.out.println(printingPress.getMaterialExpenses());
        System.out.println(printingPress.getPaperExpenses());
        printingPress.buyPaper(500, PaperType.GLOSSY, PageSize.A1);


        System.out.println(printingPress.getPublicationsList());
        System.out.println(printingPress.getPaperExpenses());

        Printing_Machine printingMachine = new Printing_Machine(200, PaperColor.blackAndWhite, 20);

        printingPress.addPrintingMachine(printingMachine);

        System.out.println(printingMachine.getColor());
//
//
//        List<Printing_Machine> printingMachines = printingPress.getPrintingMachines();
//        double pmExpenses = 0;
//        for (PrintingMachine pm : printingMachines) {
//            pmExpenses += pm.getPriceOfThePrintingMachine();
//        }
//
//
//        Employee employee = new Operators("John Doe");
//        printingPress.hireEmployee(employee);

    }


}