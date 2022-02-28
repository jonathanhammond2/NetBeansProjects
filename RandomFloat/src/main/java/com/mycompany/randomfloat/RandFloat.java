package com.mycompany.randomfloat;

import java.util.Random;

public class RandFloat {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int num1 = rand.nextInt();
        float num2 = rand.nextFloat();
        
        System.out.println("A random number between 0 and 1: " + num2);
        
        //0.0 up to 7.999999
        num2 = rand.nextFloat()*8;
        System.out.println("A random number between 0 and 8: "+num2);
        
        num1 = (int)num2 + 1;
        System.out.println("A random number between 0 and 8: "+num1);
        
        
        
               
    }
    
}
