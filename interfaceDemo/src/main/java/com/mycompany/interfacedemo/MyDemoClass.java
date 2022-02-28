/*
* Java does not support "Multiple Inheritance" using "extends"
* (a class can only inherit from one superclass)
* A class can implement multiple interfaces (separated by comma)
*/
package com.mycompany.interfacedemo;

/**
 *
 * @author family
 */
public class MyDemoClass implements MyFirstInterface, MySecondInterface{
    public void my1IFMethod(){
        System.out.println("My 1st Interface Method");
    }
    public void my2IFMethod(){
        System.out.println("My 2nd Interface Method");
    }
}
