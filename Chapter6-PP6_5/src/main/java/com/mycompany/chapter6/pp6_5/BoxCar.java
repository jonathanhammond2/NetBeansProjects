package com.mycompany.chapter6.pp6_5;

/**
 *
 * @author family
 */
public class BoxCar {
    
    /*
    roll a pair of dice 1000 times
    count the number of box cars (two sixes)
    */

    public static void main(String[] args) {
        final int ROLLS = 1000, TARGET = 12;
        int total;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        int count11 = 0;
        int count12 = 0;
                
        
        PairOfDice dice = new PairOfDice();
        
        for (int roll=0;roll<ROLLS;roll++){
            total = dice.roll();
            switch (total){
                case 2:count2++;break;
                case 3:count3++;break;
                case 4:count4++;break;
                case 5:count5++;break;
                case 6:count6++;break;
                case 7:count7++;break;
                case 8:count8++;break;
                case 9:count9++;break;
                case 10:count10++;break;
                case 11:count11++; break;
                case 12:count12++;
            }
           
        }
        System.out.println("Numbeer of rolls: " + ROLLS +
                "\nNumber of SnakeEyes: " + count2 +
                "\nNumber of 3s: " + count3 +
                "\nNumber of 4s: " + count4 +
                "\nNumber of 5s: " + count5 +
                "\nNumber of 6s: " + count6 +
                "\nNumber of 7s: " + count7 +
                "\nNumber of 8s: " + count8 +
                "\nNumber of 9s: " + count9 +
                "\nNumber of 10s: " + count10 +
                "\nNumber of 11s: " + count11 +
                "\nNumber of BoxCars: " + count12 );
    }
    
}
