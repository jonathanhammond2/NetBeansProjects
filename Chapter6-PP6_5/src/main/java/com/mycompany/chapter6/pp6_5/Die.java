/*
Die.Java
Die Class represents one die (singular of dice)
with faces shwoing values between 1 & the max number of faces on the die
*/
package com.mycompany.chapter6.pp6_5;

public class Die {
    private final int MAX = 6; //by convention we make final variables capital 
    //so it stands out
    
    private int faceValue; //current value showing on the die
    
    public Die()//Constructor
    {
        faceValue = 1;
    }
    
    public int roll()
    {
        faceValue = (int) (Math.random()*MAX)+1;
        return faceValue;
    }

    public int getMAX() {
        return MAX;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "Die{" + "MAX=" + MAX + ", faceValue=" + faceValue + '}';
    }
    
}
