/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author family
 */
public class StrOpsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greeting = "HelloCTIS310";
        System.out.println("The length of the greeting string is: "+
                greeting.length());
        System.out.println("the charachter at index 8 is: "+greeting.charAt(8));
        
        String PartialGreeting = greeting.substring(5, 9);
        System.out.println("The PartialGreeting string is: "+ PartialGreeting);
        System.out.println("The length of the PartialGreeting string is: " +
                PartialGreeting.length());
        
        System.out.println("Changing all the charachters to upper case: " + greeting.toUpperCase());
        System.out.println("Changing all the charachters to lower case: " + greeting.toLowerCase());
        
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Length of the Alphabet string is: " + Alphabet.length());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println("The index of locate in the text is: " + txt.indexOf("locate"));
        
        String CourseNumber = "CTIS 310";
        String CourseName = "Advanced Java Programming";
        
        System.out.println("Using the concatenation operator: ");
        System.out.println(CourseNumber + CourseName);
        System.out.println("Concatenating 3 string: "+
                CourseNumber + "-" + CourseName);
        
        System.out.println("Dealing with Special Charachters");
        String OK = "It\'s alright!";
        System.out.println("This is the String \"OK\": " + OK);
                
        System.out.println("This String \"OK\" hashcode is: " + OK.hashCode());
        
        String OK1 = "It\'s alright!2";        
        System.out.println("This String \"OK\" hashcode is: " + OK1.hashCode());
        
        System.out.println("Use replace method 1 on the string \"OK\": " + OK.replace("al", "ALL"));
        
        System.out.println("Use replace method 2 on the string \"OK\": " + OK.replace("r","w"));
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.println("Enter First Name: ");
//        String firstName = reader.nextLine();
//
//        System.out.println("Enter Last Name: ");        
//        String lastName = reader.nextLine();
//                
//        
//        reader.close();
//        
//        Random rand = new Random();
//        
//        
        
//        System.out.println("Username: " + firstName.charAt(0) + lastName.substring(0, 5) + (rand.nextInt(90) + 10));
        

        
        
//         System.out.println("enter two integer values");
//         
//         int firstInt = reader.nextInt();
//         int secondInt = reader.nextInt();
//         System.out.println("The sum of the cubes is: " + (Math.pow(firstInt, 3)+Math.pow(secondInt, 3)));
            


    }
    
}
