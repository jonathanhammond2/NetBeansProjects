package com.mycompany.chapter6.pp6_5;

public class PairOfDice {
    private Die die1, die2;
    
    public PairOfDice()
    {//constructor to create 2 6-sided die objects both with initial face values = 1;
        die1 = new Die();
        die2 = new Die();
    }
   
    public int roll()
    {//rolls both dice and returns the combined result.
        return die1.roll() + die2.roll();
    }
    
    public int getTotalFaceValue()
    {
     return die1.getFaceValue() + die2.getFaceValue();
    }
    
    public int getDie1FaceValue()
    {
        return die1.getFaceValue();
    }
    
    public int getDie2FaceValue()
    {
        return die2.getFaceValue();
    }

    @Override
    public String toString() {
        return "PairOfDice{" + "die1=" + die1 + ", die2=" + die2 + '}';
    }
    
    
}
