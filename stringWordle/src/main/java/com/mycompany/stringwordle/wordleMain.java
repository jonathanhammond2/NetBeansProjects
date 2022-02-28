
package com.mycompany.stringwordle;

import java.util.Scanner;

/**
 *
 * @author jonn
 */
public class wordleMain {
    
    private static final Words words = new Words();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = " ";
//        String output;
        while (!word.equals(words.getWordleWord())){
            System.out.println("Enter a word");
//            scan.nextLine();
            System.out.println(words.isInWordList(scan.nextLine()));
//            if (words.isInWordList(word)){
//                System.out.println("works");
////                if (words.isTheWordleWord(word)){
////                    output = "You got it!";
////                }
////                else{
////                    output = "try again";
////                }
//            }
//            else{
//                output = "Word did not meet requirements; please enter a different word";
//            }
            System.out.println(words.getWordleWord());
            
        }
        
    }}
    
//}
