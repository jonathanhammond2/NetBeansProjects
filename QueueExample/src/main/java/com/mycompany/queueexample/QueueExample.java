/*
A Queue is a First-In-First-Out (FIFO) Linear data structure
It models queues in real life, similar to the queues that you might have
seen or been in a grocery stores or at the movie theater...

New elements in a queue are added at the back and removed from the front
*/
package com.mycompany.queueexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author family
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Queue<String> waitingQueue = new LinkedList<>();
         
         //check if the queue is empty
         System.out.println("Queue is emtpy: " + waitingQueue.isEmpty());
         System.out.println("Size of queue: " + waitingQueue.size());
         
         //Adding new elements to the queue (the enqueue operation)
         System.out.println("Adding new elements to the queue "
                 + "the enqueue operation): ");
         waitingQueue.add("1");
         waitingQueue.add("2");
         waitingQueue.add("3");
         waitingQueue.add("4");
         waitingQueue.add("5");
         waitingQueue.add("6");
         waitingQueue.add("7");
         waitingQueue.add("8");
         waitingQueue.add("9");
         
        System.out.println("waitingQueue: " + waitingQueue);
        System.out.println("Queue is emtpy: " + waitingQueue.isEmpty());
        System.out.println("Size of queue: " + waitingQueue.size());
        
        //removing an element from the queue using remove()
        //the dequeue operation
        //the remove method throws NoSuchElementException if the queue is empty
        
        String name = waitingQueue.remove();
        System.out.println("remove from waitingQueue: " + name + "\nNew waiting queue: " + waitingQueue);
        
        //removing an element from the queue using poll()
        //the poll() method is similar to the remove() method 
        //except that it returns null if the queue is empty
        
        name = waitingQueue.poll();
        
        System.out.println("Remove from waiting queue: "+ name + "\n waitingQueue: " + waitingQueue);
        
        //get the first element (element @ front) of the queue
        //withhout removing it using element() method
        //the leement method throws NoSuchElementExpection if the queue is empty
        String firstElem = waitingQueue.element();
        System.out.println("First person in the Waiting Queue using the element()"
                + "method is: " + firstElem);
        
        //get the first element (element @ front) of the queue
        //withhout removing it using peek() method
        //the peek method is similar to the element() method except that 
        //it returns null if the queue is empty
        firstElem = waitingQueue.element();
        System.out.println("First person in the Waiting Queue using the element()"
                + "method is: " + firstElem);
        
        System.out.println("===Iterating over a queue using Java8 forEach() method===");
        waitingQueue.forEach(name2->{System.out.println(name2);});
        
        System.out.println();
        
        System.out.println("====Iterating over a queue using iterator(0 method====");
        
        Iterator<String> wqIterator = waitingQueue.iterator();
        
        while (wqIterator.hasNext()){
            System.out.println(wqIterator.next());
        }
    }
    
}
