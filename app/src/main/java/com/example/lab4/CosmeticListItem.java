package com.example.lab4;

public class CosmeticListItem {
    private int resource;
    private String categoryTitle;

    public CosmeticListItem(int resource, String categoryTitle) {
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
