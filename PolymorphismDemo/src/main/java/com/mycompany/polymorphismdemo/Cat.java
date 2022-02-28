package com.mycompany.polymorphismdemo;

/**
 *
 * @author family
 */
public class Cat extends Animal{ //extends is a java keyword that is used to 
    //implement inheritence
    private String color;

    public Cat(String color) {
        this.color = color;
    }
    
//color default is white (default constructor)
    public Cat(boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
        //color default is white
        this.color = "White";
    }
    public Cat(boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs, String color) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
        //color default is white
        this.color = color;
        
    }
    //color is determiend by user
    public Cat(String color, boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
        this.color = color;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void animalSound(){
        System.out.println("Meow Meow");
    }
}
