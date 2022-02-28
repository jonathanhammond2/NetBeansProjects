package com.mycompany.inheritanceexample.guilfordcollege;

/**
 *
 * @author family
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor Prof1 = new Professor ("Tony", 123, "CompSci");
        Prof1.setSpecialty("Computer Science");
        Prof1.setName("Tony Stark");
        
        Address add = new Address("58 W. Friendly Ave",
        "Greensboro", "NC", "27410");
        Prof1.setAddress(add);
        
        System.out.println(Prof1.toString());
        
        Prof1.work();
    }
    
}
