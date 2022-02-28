package com.mycompany.randnum;

import java.util.Random;

public class RandNum {

   
    public static void main(String[] args) {
        //practice of Random numbers
        Random rand = new Random();
        
        System.out.println("Generating a random number: "+rand.nextInt());
        System.out.println("Generating a second random number: "+rand.nextInt());
        System.out.println("Generating a third random number: "+rand.nextInt());
        System.out.println("Generating a fourth random number: "+rand.nextInt());
        
        //generate a random number between zero and 9
        System.out.println("Generating a random number between 0 and 9: "+rand.nextInt(10));
        System.out.println("Generating a random number between 0 and 9: "+rand.nextInt(10));
        System.out.println("Generating a random number between 0 and 9: "+rand.nextInt(10));
        
        //generate a random dice face value
        System.out.println("generate a random dice face value: " + (rand.nextInt(6)+1));
        
        //generate a random number between -15 and 7
        System.out.println("generate a random number between -15 and 7: "+(rand.nextInt(23)-15));
        
        //generate a random number between -50 and 50
        System.out.println("generate a random number between -50 and 50: "+(rand.nextInt(101)-50));
        
        //generate a random number between -100 and 50
        System.out.println("generate a random number between -100 and 50: "+(rand.nextInt(151)-100));
        
        //generate a random number between -20 and -10
        System.out.println("generate a random number between -20 and -10: "+(rand.nextInt(11)-20));
        
//        System.out.println("What will happen?: "+(rand.nextInt(-10))); //gives an error
        
        System.out.print(rand.nextInt()%10);
        //Modulus gives an integer (the remainder of the division by that number)

    }
    
}
