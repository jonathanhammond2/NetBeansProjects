/*
A static variable is common to all the instances or objects of the class
because it is a class level variable
A single copy of the static vriable is created and shared among all the instances of the class.
Memory allocation for such variables only happens once when the class is loaded in the memory.
Like variables, we can havestatic block, static method, & static class.
*/


package com.mycompany.staticvariableexample1;


public class StaticVariable1 {
    static int count = 0; //count is a static variable
    public void increment(){
        System.out.println("\nInside the public void increment() method: ");
        System.out.println("\nThe increment() method increments the static int + count variable:");
        count++;
        
    }
    
    public static final int MY_STATIC_VARIABLE = 27;
    //this static variable is constant
    //note that final variables always need to be initialized
    //MU_STATIC VARIABLE is public which means any class can use it
    //It is a static varaible so you won't need any object of class in order to access it.
    //It is also final so the value of this variable can never be changed in the current or in any class
    static int num;
    static String myStr;
    
    static {
        System.out.println("\nInside of my first static block: ");
        num = 17;
        myStr = "Block 1 static keyword in Java";
        //Note that both these static variables were initialized
        //before we accessed them in the main method.
        System.out.println("Block1 num: " + num);
        System.out.println("Block1 myStr: " + myStr);

    }
    
    static {
        System.out.println("\nInside of my second static block: ");
        num = 29;
        myStr = "Block 2 static keyword in Java";
        //Note that both these static variables were initialized
        //before we accessed them in the main method.
        System.out.println("Block2 num: " + num);
        System.out.println("Block2 myStr: " + myStr);

    }
    
    
    public static void main(String[] args) {
        //note that main is also a static method.
        
        StaticVariable1 object1 = new StaticVariable1();        
        StaticVariable1 object2 = new StaticVariable1();
        
        object1.increment();
        object2.increment();
        
        System.out.println("object1 count is: " + object1.count);
        System.out.println("object2 count is: " + object2.count);
        
        object1.count = 10;
        System.out.println("object1 count is: " + object1.count);
        object1.count = 20;
        System.out.println("object2 count is: " + object2.count);
        
        System.out.println("value of num " + num);
        System.out.println("Value of myStr: " + myStr);
    }
    
    
}
