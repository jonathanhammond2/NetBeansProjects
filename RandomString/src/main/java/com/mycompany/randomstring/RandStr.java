package com.mycompany.randomstring;

import java.util.Random;

public class RandStr {

    
    public static void main(String[] args) {
        //Choos a random charachter from this string;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUBWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String RandString ="";
        int size = 1000;
        for (int i=0;i<size;i++){
            //generate a random number
            RandString = RandString + AlphaNumericString.charAt((int)(Math.random()*AlphaNumericString.length()));

        }
        System.out.println(RandString);
        
    }
    
}
