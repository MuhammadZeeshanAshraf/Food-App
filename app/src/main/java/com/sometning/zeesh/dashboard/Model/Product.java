package com.sometning.zeesh.dashboard.Model;

public class Product
{
    Integer picture;
    String price;
    String description;
    String title;

    public Product(Integer picture, String price, String description, String title) {
        this.picture = picture;
        this.price = price;
        this.description = description;
        this.title = title;
    }

    public Product() {
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
