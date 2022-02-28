package com.mycompany.polymorphismdemo;

/**
 *
 * @author family
 */
public class Animal {
    private boolean vegetarian;
    private boolean carnivore;
    private boolean omnivore;
    
    private String eats;
    
    private int numOfLegs;

    public Animal(){} //empty constructor
    
    //constructor
    public Animal(boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.carnivore = carnivore;
        this.omnivore = omnivore;
        this.eats = eats;
        this.numOfLegs = numOfLegs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }

    public boolean isCarnivore() {
        return carnivore;
    }

    public boolean isOmnivore() {
        return omnivore;
    }

    public String getEats() {
        return eats;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }

    public void setOmnivore(boolean omnivore) {
        this.omnivore = omnivore;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" + "vegetarian=" + vegetarian + ", carnivore=" + carnivore + ", omnivore=" + omnivore + ", eats=" + eats + ", numOfLegs=" + numOfLegs + '}';
    }
    
    public void animalSound(){
        System.out.println("Inside the animalSound method");
    }
    
    
}
