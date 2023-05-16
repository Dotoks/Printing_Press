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
        return 0;
    }

    private double getGlossyPrice(PageSize pageSize){
        return 0;
    }

    private double getNewsPaperPrice(PageSize pageSize){
        return 0;
    }
}
