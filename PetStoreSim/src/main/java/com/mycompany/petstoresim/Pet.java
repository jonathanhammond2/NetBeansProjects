package com.mycompany.petstoresim;

public abstract class Pet {

    private String PetID;

    private String Name;

    private int age;

    private String breed;

    private String color;

    private double weight;

    private Boolean immunized;

    private aquisition aquired;

    private int price;

    private careLVL care;

    public Pet(String PetID, String Name, int age, String breed, 
            String color, double weight, Boolean immunized, aquisition aquired, 
            int price, careLVL care) {
        this.PetID = PetID;
        this.Name = Name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.immunized = immunized;
        this.aquired = aquired;
        this.price = price;
        this.care = care;
    }
    
    

    public abstract String toString();

    public String getPetID() {
        return PetID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getImmunized() {
        return immunized;
    }

    public aquisition getAquired() {
        return aquired;
    }

    public int getPrice() {
        return price;
    }

    public careLVL getCare() {
        return care;
    }

    public void setPetID(String PetID) {
        this.PetID = PetID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setImmunized(Boolean immunized) {
        this.immunized = immunized;
    }

    public void setAquired(aquisition aquired) {
        this.aquired = aquired;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCare(careLVL care) {
        this.care = care;
    }
    
    
}
