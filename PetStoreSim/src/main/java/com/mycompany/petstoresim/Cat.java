package com.mycompany.petstoresim;

public class Cat extends Pet {

    public Cat(String PetID, String Name, int age, String breed, String color, double weight, Boolean immunized,
            aquisition aquired, int price, careLVL care) {
        super(PetID, Name, age, breed, color, weight, immunized, aquired, price, care);
        //TODO Auto-generated constructor stub
    }

    private Boolean hairy;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
}
