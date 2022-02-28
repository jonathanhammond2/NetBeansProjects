/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.overflowexample;

/**
 *
 * @author family
 */
public class OverFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int under, over;
        under = 2147483647;
        over = under + 1;
        
        System.out.println("Under value = " + under
        + "\nOver value = " + over);
        // TODO code application logic here
    }
    
}
