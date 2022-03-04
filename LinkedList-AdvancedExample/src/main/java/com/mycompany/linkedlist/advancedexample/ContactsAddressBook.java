package com.mycompany.linkedlist.advancedexample;

import java.util.LinkedList;
import java.util.List;

public class ContactsAddressBook {
    
    public static void main (String[] args){
        
    
    LinkedList<Person> CAB = new LinkedList<>();
    
    Address add1 = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", "27410");
    Address add2 = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", "27410");
    Address add3 = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", "27410");
    Address add4 = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", "27410");
    Address add5 = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", "27410");
    
//    CAB.add(new Person("Martin","Scorsese",add1,22211333));
    CAB.add(new Person("Martin", "Scorese", add1, 222113333));
    Person Per2 = new Person("Mark", "Wahlberg", add2, 11122333);
    
    CAB.add(Per2);
    
    CAB.add(new Person("Matt", "Damon", add3, 33311222));
    
    for (Person element: CAB)
        System.out.println(element + "\n");
    
    System.out.println("First element: " + CAB.getFirst());
    System.out.println("Last element: " + CAB.getLast());
    
    System.out.println(CAB);
    System.out.println("\n\n SUBLIST");
    List subList = CAB.subList(1,4);
    System.out.println("Sublist is:\n" + subList);
    
    subList.remove(2);
    
    Person Per5 = new Person("Anthony", "Anderson", add5, 55511333);
    
    CAB.addLast(Per5);
    
    System.out.println("Removing the nth element of a specific element from the "
            + "LinkedList");
    
    
    }
}
