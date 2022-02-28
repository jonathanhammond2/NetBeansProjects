
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author family
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int OPTIONS = 3;
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int COMPUTER = 1, PLAYER = 2, TIE = 3;
        
        int computerChoice, playerChoice, winner = 0;
        int wins = 0, losses = 0, ties = 0;
        
        String again;
        
        Scanner scanner = new Scanner (System.in);
        
        again = "y";
        
        while (again.equalsIgnoreCase("y")){
            computerChoice = (int)(Math.random()*OPTIONS) + 1;
            System.out.println("Please enter your choice:\n\t"
                    + "1 for Rock\n\t"
                    + "2 for Paper\n\t"
                    + "3 for Scissors\n\t");
            playerChoice = scanner.nextInt();
            System.out.print("My choice was ");
            if(computerChoice == ROCK){
                System.out.println("Rock");
                if(playerChoice == SCISSORS)
                    winner = COMPUTER;
                else 
                    if(playerChoice == PAPER)
                        winner = PLAYER;
                    else 
                        winner = TIE;
            }
            if(computerChoice == PAPER){
                System.out.println("Paper");
                if(playerChoice == ROCK)
                    winner = COMPUTER;
                else 
                    if(playerChoice == SCISSORS)
                        winner = PLAYER;
                    else 
                        winner = TIE;
            }
            if(computerChoice == SCISSORS){
                System.out.println("Scissors");
                if(playerChoice == PAPER)
                    winner = COMPUTER;
                else 
                    if(playerChoice == ROCK)
                        winner = PLAYER;
                    else 
                        winner = TIE;
            }
        }
    }
    
    
}
