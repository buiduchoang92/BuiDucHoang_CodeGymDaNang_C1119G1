package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String dateProduction;
    private String whereProduction;

    public Product(int id, String name, String dateProduction, String whereProduction) {
        this.id = id;
        this.name = name;
        this.dateProduction = dateProduction;
        this.whereProduction = whereProduction;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(String dateProduction) {
        this.dateProduction = dateProduction;
    }

    public String getWhereProduction() {
        return whereProduction;
    }

    public void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }
}
