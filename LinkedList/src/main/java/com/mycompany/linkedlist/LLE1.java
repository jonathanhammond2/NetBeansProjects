package com.mycompany.linkedlist;

import java.util.LinkedList;

public class LLE1 {

    public static void main(String[] args) {
        //LL declaration
        LinkedList<String> myLinkedList = new LinkedList<>();
        
        //Add elementsto the LL
        myLinkedList.add("Item1");
        myLinkedList.add("Item2");
        myLinkedList.add("Item3");
        myLinkedList.add("Item4");
        myLinkedList.add("Item5");
        myLinkedList.add("Item6");
        myLinkedList.add("Item7");
        
        //Display LL Content
        System.out.println("Items in the Linked List Content:\n"
                + myLinkedList);
        System.out.println("Size of the Linked List:\n"
                + myLinkedList.size() + "\n\n");
        
        //Add first and last elements
        myLinkedList.addFirst("Item0");
        myLinkedList.addLast("Item10");
        myLinkedList.add(3, "Item?");
        
        System.out.println("Items in the Linked List Content:\n"
                + myLinkedList);
        System.out.println("Size of the Linked List:\n"
                + myLinkedList.size() + "\n\n");
        
        //Getting and setting values
        Object firstVar = myLinkedList.get(0);
        System.out.println("First element in Linked List: "
                + firstVar);
        myLinkedList.set(0,"Changed 1st Item");
        
        Object firstVar0 = myLinkedList.get(0); //Use object because linkedList is made up of objects that contain data
        //if we used String, we'd have to get the object and then get the String info contained in the object
        System.out.println("My new First Element in Linked List: " + firstVar0);
        
        System.out.println("Items in the Linked List Content:\n"
                + myLinkedList);
        System.out.println("Size of the Linked List:\n"
                + myLinkedList.size() + "\n\n");
        
        //Remove 1st & remove last
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        
        System.out.println("Items in the Linked List Content:\n"
                + myLinkedList);
        System.out.println("Size of the Linked List:\n"
                + myLinkedList.size() + "\n\n");
        
        //removing different elements
        System.out.println("Removing the first occurance of 'Item 6' from the list:");
        myLinkedList.removeFirstOccurrence("Item6");
        System.out.println("Linked List content after modification:\n"
                + myLinkedList + "\n");
        System.out.println("Removing the last occurance of 'Item3' from the list: ");
        myLinkedList.removeLastOccurrence("Item3");
        System.out.println("Linked List content after modification: \n"
                + myLinkedList + "\n");
        
        //Add to a position and remove from a position
        myLinkedList.add(0, "Newly Added Item");
        System.out.println("Linked List content after modification:\n"
                + myLinkedList + "\n");
        myLinkedList.remove(2);
        System.out.println("Linked List content removing item at index 2:\n"
                + myLinkedList + "\n");
        
        boolean var = myLinkedList.contains("Item4");
        System.out.println("Does myLinkedList contain 'Item4'? " + var + "\n");
        
        myLinkedList.remove("Item?");
        
        Object str = myLinkedList.clone(); //returns the copy of the linked list
        
        System.out.println("The cloned Linked List is: \n" + str);
        
        //removes all the elements of the list
        myLinkedList.clear();
        
        System.out.println("myLinkedList Content after being clear is:\n "
                + myLinkedList);
        
        
        
    }
    
}
