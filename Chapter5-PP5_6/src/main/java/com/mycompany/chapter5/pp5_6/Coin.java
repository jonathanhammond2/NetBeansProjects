package com.mycompany.chapter5.pp5_6;

/**
 *
 * @author family
 */
public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face;
    
    public Coin(){
        flip(); //sets up the coin by flipping in initially
    }
    
    public void flip(){
        //flips the coin by randomly choosing a face value
        face = (int)(Math.random()*2);
    }
    public boolean isHead(){
        return (face == HEADS);
    }
    public boolean isTails(){
        return (face == TAILS);
    }
    
    public String toString(){
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "False";
        return faceName;
    }
}
