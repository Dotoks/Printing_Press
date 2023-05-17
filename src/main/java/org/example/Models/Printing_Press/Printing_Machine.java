package org.example.Models.Printing_Press;

import org.example.Enums.PaperColor;

public class Printing_Machine {

    public Integer paperCapacity;

    public PaperColor color;

    public Integer printingSpeed;

    public Printing_Machine(Integer paperCapacity, PaperColor color, Integer printingSpeed) {
        this.paperCapacity = paperCapacity;
        this.color = color;
        this.printingSpeed = printingSpeed;
    }

    public Integer getPaperCapacity() {
        return paperCapacity;
    }

    public PaperColor getColor() {
        return color;
    }

    public Integer getPrintingSpeed() {
        return printingSpeed;
    }
}
