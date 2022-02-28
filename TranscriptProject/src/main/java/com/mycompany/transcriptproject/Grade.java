package com.mycompany.transcriptproject;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author family
 */
public class Grade {
    //build an enum for letter grades with grade points assigned to each
    public enum Grades {
        A(4.0), AM(3.7), BP(3.3), B(3.0), BM(2.7), CP(2.3), C(2.0),CM(1.7), DP(1.3), D(1.0), DM(0.7), F(0);
        private double value;
        Grades(double value){
            this.value = value;
        }
        double getValue() {
            return value;
        }
        

    }
    
    private static Random rand = new Random();
    
    //Return a random number
    public static Grades randomGrade(){
        //values returns an array containing the list of enum values
        //(A, AM, B, etc)
        int gradeChoice = rand.nextInt(Grades.values().length);
        return Grades.values()[gradeChoice];
    }
    
}
