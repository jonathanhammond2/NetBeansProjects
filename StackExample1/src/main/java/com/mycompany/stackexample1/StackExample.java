/*
Notes about Stack:
A Stack is a linear data structure that is used to store a collection of objects
A stack is baset on Last-In First-Out (LIFO)
or could be First-In Last-Out (FILO)

Java collection framework provides many interfaces and classes to store the
collection of objects.

1- Create a stack
2- preform Push & Pop operation in a stack
3- check if stack is empty
4- Find the size of the stack
5- Search for an element in the stack
 */
package com.mycompany.stackexample1;

import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author jonn
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        
        //check if the stack is empty
        System.out.println("Stack is empty: " + stackOfCards.isEmpty());
        
        //Find the size of the stack
        System.out.println("Size of stack: " + stackOfCards.size());
        
        //Pushing new elements to the Stack (adding elements)
        System.out.println("\nPushing new elements to the Stack: ");
        stackOfCards.push("1");
        stackOfCards.push("2");
        stackOfCards.push("3");
        stackOfCards.push("4");
        stackOfCards.push("5");
        stackOfCards.push("6");
        stackOfCards.push("7");
        
        System.out.println("Stack: " + stackOfCards);
        
        //check if the stack is empty
        System.out.println("Stack is empty: " + stackOfCards.isEmpty());
        
        //Find the size of the stack
        System.out.println("Size of stack: " + stackOfCards.size());
        
        //Popping items from the stack
        String cardAtTop = stackOfCards.pop();
        //Throws EmptyStackExeption of the staci is empty
        System.out.println("Stack.pop() :: " + cardAtTop);
        System.out.println("Current Stack :: " + stackOfCards);
        System.out.println();
        
        //Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Current Stack :: " + stackOfCards);
        System.out.println();
        
        
        //Search for an element
        //The search() method returns the based position of the element from the 
        //top of the Stack
        //-1 if the element was not found in the stack
        
        System.out.println("\nSearching for an element in the stack");
        int position = stackOfCards.search("1");
        if (position!=-1)
            System.out.println("Found element 1 is at position " + position);
        else System.out.println("Element not found");
        
        System.out.println("==== Iterate over a stack using Java8 forEach() method =====");
        stackOfCards.forEach(card-> {System.out.println(card);});
        
        System.out.println("==== Iterate over a stack using iterator() method =====");
        Iterator<String> cardIterator = stackOfCards.iterator();
        
        while(cardIterator.hasNext()){
            String Card1 = cardIterator.next();
            System.out.println(Card1);
        }
        
        System.out.println("==== Iterate over a stack from TOP to BOTTOM "
                + "using lsitIterator =====");
        //listITerator allows you to traverse in both forward and backward directions
        stackOfCards.forEach(card-> {System.out.println(card);});
        
        //we'll start from the top of the stack and traverse backwards
        
        ListIterator<String> cardListIterator = 
                stackOfCards.listIterator(stackOfCards.size());
        
        while (cardListIterator.hasPrevious()){
            String card2 = cardListIterator.previous();
            System.out.println(card2);
        }
        
        System.out.println("\nReversing the stack using a clone stack");
        //create another stack to copy
        Stack stackR = (Stack)stackOfCards.clone();
        Stack stackReverse = new Stack<>();
        
        for (int i = 0; i<stackOfCards.size();i++){
            //popping items from the stack
            Object cardAtTopR = stackR.pop();
            //Throws EmptyStackExpection if the stack is empty
            System.out.println("StackR.pop() :: " + cardAtTopR);
            stackReverse.push(cardAtTopR);
            System.out.println("Reversed Stack :: " + stackReverse);
        }
        
        
        
    }
    
}
