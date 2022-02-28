package com.mycompany.petstoresim;


import java.time.LocalDate;

public abstract class Inventory {

    private int price;

    private String petType;

    private LocalDate dateAdded;

    public Inventory(int price, String petType, LocalDate dateAdded) {
        this.price = price;
        this.petType = petType;
        this.dateAdded = dateAdded;
    }

    public int getPrice() {
        return price;
    }

    public String getPetType() {
        return petType;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    
}
