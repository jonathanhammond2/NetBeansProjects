
package com.mycompany.stars;

public class Staras {

    public static void main(String[] args) {
        // TODO code application logic here
        final int SPACES = 0;
        final int STARS = 10;
        final int LIMIT = 10;
        for (int row = 1; row <= LIMIT; row++)
        {//ch5 6.7 part a
            for (int star = 1; star <=LIMIT - row + 1;star++){
                printStar();
            }
            System.out.println();
        }
        
        for (int row = 1; row <= LIMIT; row++)
        {//ch5 6.7 part a
            for (int space = 1; space <=LIMIT - row; space++){
                printSpace();
            }
            for (int star = 1; star <=row; star++)
                printStar();
            
            System.out.println();
        }
        System.out.println(" ");
        for (int row = 1; row <= LIMIT; row++)
        {//ch5 6.7 part a
            for (int space = 1; space <=row-1; space++){
                printSpace();
            }
            for (int star = 1; star <=LIMIT-row; star++)
                printStar();
            
            System.out.println();
        }
        
        //diamond
        for (int row = 1; row<= LIMIT/2; row++)//top half of the diamond
        {
            for (int space=1; space <= (LIMIT/2-row); space++)
                printSpace();
            for (int star=1; star <= (row*2-1); star++)
                printStar();
            System.out.println();
        }
         for (int row = 1; row<= LIMIT/2; row++)//bottom half of the diamond
        {
            for (int space=1; space <= row-1; space++)
                printSpace();
            for (int star=1; star <= LIMIT-(row*2)+1; star++)
                printStar();
            System.out.println();
        }
        
    }
    
    public static void printStar(){
        System.out.print("*");
    }
    public static void printSpace(){
        System.out.print(" ");
    }
    
}
