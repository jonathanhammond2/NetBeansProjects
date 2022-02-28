
package com.mycompany.chapter5.pp5_4;

import java.util.Scanner;

public class HiLo {

  
    public static void main(String[] args) {
        //randomly select a number which the user tries to guess.
        
        final int MAX = 100;
        
        int target, count, guess;
        String again = "y";
        
        Scanner scanner = new Scanner(System.in);
            
        while (again.equalsIgnoreCase("y")){
            System.out.println("Guess a number between 1 and " + MAX);
        
        
        target = (int)(Math.random()*MAX) + 1;
        count = 0;
        guess = 1;
        while(guess!=target && guess > 0){
            System.out.println("Please enter your guess (0 to quit): ");
            guess = Integer.parseInt(scanner.nextLine());
//            guess = scanner.nextInt();
            count++;
            
            if (guess > 0)
                if (guess == target)
                    System.out.println("You got it! Guesses: " + count);
                else
                    if (guess < target)
                        System.out.println("Your guess was too low");
                    else
                        System.out.println("Your guess was too high");
                        
            }
        System.out.println("\nWould you like to play again (y/n)?: ");
        again = scanner.nextLine();
            
        }
    }
}
    

