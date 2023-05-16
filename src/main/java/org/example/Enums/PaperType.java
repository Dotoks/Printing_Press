package org.example.Enums;

public enum PaperType {
    NORMAL,
    GLOSSY,
    NEWSPAPER;

    public double getPrice(PageSize pageSize){

        return switch (this) {
            case NORMAL -> GetNormalPrice(pageSize);
            case GLOSSY -> getGlossyPrice(pageSize);
            case NEWSPAPER -> getNewsPaperPrice(pageSize);
        };
    }

    private double GetNormalPrice(PageSize pageSize){
        return switch (pageSize){
            case A1 -> 1;
            case A2 -> 0.75;
            case A3 -> 0.5;
            case A4 -> 0.35;
            case A5 -> 0.20;
        };
    }

    private double getGlossyPrice(PageSize pageSize){
        return switch (pageSize){
            case A1 -> 1.15;
            case A2 -> 0.90;
            case A3 -> 0.65;
            case A4 -> 0.50;
            case A5 -> 0.35;
        };
    }

    private double getNewsPaperPrice(PageSize pageSize){
        return switch (pageSize){
            case A1 -> 0.85;
            case A2 -> 0.60;
            case A3 -> 0.35;
            case A4 -> 0.20;
            case A5 -> 0.05;
        };
    }
}
