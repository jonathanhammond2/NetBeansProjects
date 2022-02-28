/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraysort;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class sortArray {
    private final static int N = 30;
    private static Random rand = new Random();
    private static DecimalFormat formatter = new DecimalFormat("0.00");
    private static long now;
    private static double elapsed;
    
    
    public static void main(String[] args) {
        int[] a = new int[N];
        int[] b = new int[N];
         for (int i = 0; i<N;i++){
             a[i] = rand.nextInt(20);
             b[i] = rand.nextInt(20);
         }
         
         
//         System.out.println("Unsorted: " + Arrays.toString(a));
        int searchValue = 0;
        now = System.nanoTime();
        int sequentialResult = sequentialSearch(a, searchValue, 0, a.length);
        elapsed = (System.nanoTime()-now)/1.e6;
        System.out.println("Sequential search result: " + sequentialResult);
        System.out.println("Sequential search: " + formatter.format(elapsed));
         
        quickSort(a, 0, N);
        elapsed = (System.nanoTime() - now)/1.e6; //convert to ms
        System.out.println("quick sort: " + formatter.format(elapsed));
         
//        searchValue = -1;
        now = System.nanoTime();
        int binaryResult = binarySearch(a, searchValue, 0, a.length);
        elapsed = (System.nanoTime()-now)/1.e6;
        System.out.println("Binary search result: " + sequentialResult);
        System.out.println("Binary search: " + formatter.format(elapsed));
        
        now = System.nanoTime(); 
         
        insertionSort(b, 0, N);
        elapsed = (System.nanoTime() - now)/1.e6; //convert to ms
        System.out.println("Selection sort: " + formatter.format(elapsed));
         
         
         System.out.println("Sorted: " + Arrays.toString(a));
     
    }
    
    public static int binarySearch(int[] a, int searchValue, int first, int last){
//        int index = first;
        int result = -1; //what we return if the searchValue isn't in the array;
        int mid = first + (last-1-first)/2-1;
        if (first>last){
            result = -1; //the element isn't in the subarray
        }
        else if (a[mid] == searchValue){
            result = mid; //we got lucky and the search value was at the midpoint
        }
        else if (a[mid] > searchValue){
            result = binarySearch(a, searchValue, first, mid-1);
        }
        else {
            result = binarySearch(a, searchValue, mid+1, last);
        }
        return result;
    }
    public static int sequentialSearch(int[] a, int searchValue, int first, int last){
        //start at the beginning
        int index = first;
        //if we don't find the value we're looking for, we'll return -1
        while (index<last){
            if (a[index] == searchValue){
                break;
            }
            else{
                index++;
            }
        }
        
        return index;
    }
    
    public static void quickSort(int[] a, int first, int last) {
        //only to quickSort for more than three array elements
        if (last - first > 3) {
            //what's the middle element
            int mid = first + (last - first) / 2;
            //sort the first, middle, and last elements
            if (a[first] > a[mid]) {
                swapElements(a, first, mid);
            }
            if (a[mid] > a[last - 1]) {
                swapElements(a, mid, last - 1);
            }
            if (a[first] > a[mid]) {
                swapElements(a, first, mid);
            }
            
            //move the pivot to the end
            swapElements(a, mid, last - 1);
            int pivotValue = a[last - 1];
            
            //start from both sides and work inwatds
            int indexFromLeft = first + 1;
            int indexFromRight = last - 2;
            boolean done = false; //this becomes true once all the elements
            //are positioned relative to the pivot
            while (!done) {
                //move from the left until we find an element greater than the pivot
                while (a[indexFromLeft] < pivotValue) {
                    indexFromLeft++;
                }
                //move from the right until we have an element less than the pivot
                while (a[indexFromRight] > pivotValue) {
                    indexFromRight--;
                }
                //provided that the left and right pointers have not crossed
                //swap the elemeents
                if (indexFromLeft < indexFromRight) {
                    swapElements(a, indexFromLeft, indexFromRight);
                    indexFromLeft++;
                    indexFromRight--;
                } else {
                    done = true;
                }
            }
            //once the pointers cross, move the pivot into the correct location
            swapElements(a, last - 1, indexFromLeft);
            
            //let's use quickSort to sort each subarray on either side of the pivot
            quickSort(a, first, indexFromLeft);
            quickSort(a, indexFromLeft + 1, last);
            
        } else {
            insertionSort(a, first, last);
        }
    }
    
    //Selection sort
    //Find the smallest element in the unsorted part of the array
    //Swap it with the first element in the usorted part of the array
    public static void selectionSort(int[] a, int first, int last){
        //Sort a between indices first and last, inclusive
        for (int i = first; i<last; i++){
            //Find the smallest value in the array
            //Initialize with the first element in the unsorted part of the array
            int small = a[i];
            int iSmall = i;
            for (int j = i+1; j<last; j++){
                if (a[j]<small){
                    small = a[j];
                }
            }
            //We now know the smallest value in the unsorted array
            if (i != iSmall){
                swapElements(a, i, iSmall);
            }
        }
    }
    
    public static void insertionSort(int[] a, int first, int last){
        for (int i = first+1; i<last; i++){
            int next = a[i];
            //start searching backwards for where we're going to insert next
            int iFill = i - 1;
            while (iFill >=0 && next < a[iFill]){
                //As long as this is true, move the iFill element up one to make space
                a[iFill+1] = a[iFill];
                iFill--;
            }
            //When we're done, we know where our element belongs
            a[iFill + 1] = next;
        }
    }
    
    public static void swapElements(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    //Shuffle the array
    public static void shuffleArray(int[] a){
        int index;
        for (int i = a.length-1; i>0; i--){
            index = rand.nextInt(i+1);
            swapElements(a, i, index);
        }
    }
    
}
