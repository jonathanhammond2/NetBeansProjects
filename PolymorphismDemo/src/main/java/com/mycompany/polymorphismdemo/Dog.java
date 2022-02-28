package com.mycompany.polymorphismdemo;

/**
 *
 * @author family
 */
public class Dog extends Animal{
    private String color;
    private int weight;
    private String name;

    
//decault constructor, default is color is brown
    public Dog(int weight, String name, boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
        this.color = "Brown";
        this.weight = weight;
        this.name = name;
    }

    public Dog() {
    }

    public Dog(boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
    }
    
    
    public Dog(String color, int weight, String name, boolean vegetarian, boolean carnivore, boolean omnivore, String eats, int numOfLegs) {
        super(vegetarian, carnivore, omnivore, eats, numOfLegs);
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "color=" + color + ", weight=" + weight + ", name=" + name + '}';
    }
    
    public void animalSound(){
        System.out.println("Woof Woof");
    }
    
    
}
