/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter5.pp5_6;

/**
 *
 * @author family
 */
public class FlipRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int GOAL = 3;
        
        int count1 = 0, count2 = 0;
        int fTemp = 1;
        
        Coin coin1 = new Coin(); //create coin1 object
        Coin coin2 = new Coin(); //create coin2 object
        
        System.out.println("Coin Flip Race:");
        
        while (count1 < GOAL && count2 < GOAL){
            coin1.flip();
            coin2.flip();
            System.out.println("Flip number: " + fTemp);
            System.out.println("Coin1: " + coin1);
            System.out.println("Coin1: "+ coin1 + "\tCoin2: "+ coin2);
            
            count1 = (coin1.isHead()) ? count1+1 : 0;
            count2 = (coin2.isHead()) ? count2+1 : 0;
            
    }
     //only don't use brackets if you only have 1 line of code - 
     //if no brackets, only first line will be executed
        if (count1 < GOAL)
            System.out.println("Coin2 Wins!!");
        
        else
            if (count2 < GOAL)
                System.out.println("Coin1 Wins!!");
        else
                System.out.println("****It is a TIE****");
        
        
        // TODO code application logic here
    }
    
}
