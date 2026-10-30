package com.pluralsight;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;

    //constructor
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //Getter and Setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    //to string method to sout
    public String toString() {
        return productId + " | " + productName + " | $" + productPrice;
    }
}