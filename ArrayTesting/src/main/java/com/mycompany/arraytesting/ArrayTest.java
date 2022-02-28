package com.mycompany.arraytesting;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author family
 */
public class ArrayTest {

    public static void main(String[] args) {
        //Declare and initalize array with 4 integer elements
        int[] testScores = {4,3,4,5};
        //declare and don't initalize
        int[] testScoresOther = new int[4];
        //zero is the default value
        System.out.println("First test array: " + testScores.toString());
        System.out.println("Second test array: " + testScoresOther.toString());
        //arrays stored in contiguous locations in memory
        //points at the first element of memory location
        System.out.println("First test array: " + Arrays.toString(testScores));
        //zero is the default value
        
        //Use a loop to fill an array
        Random rand = new Random();
        
        for (int i:testScoresOther)
            i = testScoresOther[i];
        for (int i = 0; i<testScoresOther.length; i++){
            testScoresOther[i] = rand.nextInt(101);
        }
        
        //let's try to copy and array
        int[] testScoresCopy = testScores;
        //and make a change => we just copied the reference to testScores, 
        //not the actual data
        testScoresCopy[0] = 100;
        //Let's make a copy with the data
        int[] testScoresDeeperCopy = Arrays.copyOf(testScores, testScores.length);
        
        
        
        
      
        
    }
    
}
