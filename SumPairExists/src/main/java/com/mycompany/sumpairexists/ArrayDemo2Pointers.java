package com.mycompany.sumpairexists;

import java.util.Random;

public class ArrayDemo2Pointers {

    public static void reverseArray(int arr[]){
        System.out.println("reversing the array");
        int startPoint= 0, endPoint = arr.length-1;
        while (startPoint < endPoint){
            int temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }
    
    public static boolean sumPairExists(int arr[], int sum){
        int startPoint = 0, endPoint = arr.length-1;
        while(startPoint < endPoint){
            if (arr[startPoint]+arr[endPoint] == sum){
                System.out.println("The sum of this pair ("
                + arr[startPoint] + ","
                + arr[endPoint] + ") = "
                + sum);
                return true;
            }
            else if (arr[startPoint] + arr[endPoint] < sum){
                startPoint++;
            }
            else endPoint--;
        }
        return false;
    }
    
    public static void shuffle(int arr[]){
        Random rand = new Random();
        System.out.println("shuffling the array");
        for (int i = arr.length-1; i>0; i--){
            int j = rand.nextInt(i+1);
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            
        }
    }
    
    public static void main(String[] args) {
        int[] arrayDemo = {1,3,4,5,7,10};
        System.out.println("Finding the pair of a given sum = 12"
                + sumPairExists(arrayDemo, 12));
        
        
    }
    
}
