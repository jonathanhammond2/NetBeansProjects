package com.mycompany.pseudorandomnumbers;

import java.util.Random;

//Pseudo means not actually or totally random 
//        (if computer picks 5, likelyhood it will pick 5 next time is reduced)
public class PseudoRandomNumbers {

    
    public static void main(String[] args) {
        Random rand = new Random(15);
        //we define the seed to be 15
        
        for (int i=0;i<15;){
            System.out.println(rand.nextInt());
            i++;
        }
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        
        //note tat the nextInt() method generates a random integer
        //ranging from -2^31 to 2^31-1
        
        //with a specific seed, each program yields
        //the same sequence of pseudo-random numbers
        
        rand.setSeed(50);
        
        for (int i=0;i<15;){
            System.out.println(rand.nextInt());
            i++;
        }
        
        
        
    }
    
}
