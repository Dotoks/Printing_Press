package org.example.Models.Publications;

import org.example.Enums.PageSize;
import org.example.Enums.PaperType;

public class Publications {

    public Publications(String title, PaperType paperType, int numberOfPages, PageSize pageSize) {
        this.title = title;
        this.paperType = paperType;
        this.numberOfPages = numberOfPages;
        this.pageSize = pageSize;
    }
    public String title;

    public PaperType paperType;

    public int numberOfPages;

    public PageSize pageSize;

    public Double getPrice(){
        return this.paperType.getPrice(this.pageSize);
    }

    public String getTitle() {
        return title;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public PageSize getPageSize() {
        return pageSize;
    }


}
