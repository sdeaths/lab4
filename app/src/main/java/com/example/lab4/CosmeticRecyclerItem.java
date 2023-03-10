package com.example.lab4;

public class CosmeticRecyclerItem {
    private int resource;
    private String categoryTitle;

    public CosmeticRecyclerItem(int resource, String categoryTitle) {
        this.resource = resource;
        this.categoryTitle = categoryTitle;
    }

    public int getResource() {
        return resource;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }
}
