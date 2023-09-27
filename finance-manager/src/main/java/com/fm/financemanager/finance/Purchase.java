package com.fm.financemanager.finance;

public class Purchase {
    private String category;
    private String name;
    private String date;
    private Double amount;

    public Purchase(String category, String name, String date, Double amount) {
        this.category = category;
        this.name = name;
        this.date = date;
        this.amount = amount;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }









}
