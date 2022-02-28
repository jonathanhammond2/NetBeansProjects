package com.mycompany.polymorphismdemo;

/**
 *
 * @author family
 */
public class PolymorphismExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testing Animal Sounds:\n");
        
        Animal obj1 = new Dog(false, true, true, "meat", 4);
        obj1.animalSound();
        
        Animal obj2 = new Cat(true, true, true, "various", 4);
        obj2.animalSound();
        System.out.println(obj2);
        
        Cat cat = new Cat(false, true, true, "milk", 4, "black");
        System.out.println("Cat is Vegetarian? " + cat.isVegetarian());
        
        System.out.println("Cat eats: " + cat.getEats());
        
        System.out.println("Cat color: " + cat.getColor());
        
        Animal An = new Animal();
        An.animalSound();
        
        Dog doggy = new Dog(false, true, true, "Bones",4);
        doggy.animalSound();
        
    }
    
}
