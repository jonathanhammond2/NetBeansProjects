package com.mycompany.petstoresim;

public class Bird extends Pet {

    private Boolean talking;

    public Bird(Boolean talking, String PetID, String Name, int age, String breed, String color, double weight, Boolean immunized, aquisition aquired, int price, careLVL care) {
        super(PetID, Name, age, breed, color, weight, immunized, aquired, price, care);
        this.talking = talking;
    }

    
    public Boolean getTalking() {
        return talking;
    }

    public void setTalking(Boolean talking) {
        this.talking = talking;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
