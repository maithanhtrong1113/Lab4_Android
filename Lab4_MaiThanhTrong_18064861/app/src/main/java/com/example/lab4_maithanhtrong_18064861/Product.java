package com.example.lab4_maithanhtrong_18064861;



public class Product {
    private String name;
    private String supplier;
    private String rating;
    private int numOfRating;
    private double price;
    private double discount;
    private int imageResourceId;

    public Product(String name, String supplier, String rating, int numOfRating, double price, double discount, int imageResourceId) {
        this.name = name;
        this.supplier = supplier;
        this.rating = rating;
        this.numOfRating = numOfRating;
        this.price = price;
        this.discount = discount;
        this.imageResourceId = imageResourceId;
    }

    public Product(String name, String supplier, int imageResourceId) {
        this.name = name;
        this.supplier = supplier;
        this.imageResourceId = imageResourceId;
    }

    public Product(String name, String rating, int numOfRating, double price, double discount, int imageResourceId) {
        this.name = name;
        this.rating = rating;
        this.numOfRating = numOfRating;
        this.price = price;
        this.discount = discount;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getNumOfRating() {
        return numOfRating;
    }

    public void setNumOfRating(int numOfRating) {
        this.numOfRating = numOfRating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

}

