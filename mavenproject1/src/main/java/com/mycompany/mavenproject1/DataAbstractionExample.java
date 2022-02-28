package com.mycompany.mavenproject1;

/*
Data abstraction means that only the essential details are displayed to the user.
Data abstraction may also be defined as the process of indentifying
only the required charachteristics of an object while ignoring the 
irrelevant details.
The properties and behaviors of an object differentiate it from other objects
of similar types and also help in classifying/grouping the objects.
*/
public class DataAbstractionExample {

    public static void main(String[] args) {
//        Shape s = new Shape(); gives an error; because Shape is abstract class
            
            Shape circle = new Circle("Red", 5.2);
            Shape rectangle = new Rectangle("Yellow", 5, 7);
            
            System.out.println(circle.toString());
            System.out.println(rectangle.toString());
            
            circle.func(); //func is a final method in the abstract class Shape
            //func(); <-this causes error, and object has to call the final method func()
            
            Shape.staticfunc(); //staticfunc is as the name implise is a static method
            
            Shape sphere = new Sphere("Blue", 7.11);
            System.out.println(sphere.toString());
            
            Shape triangle = new Triangle("Orange",5,5,6);
            System.out.println(triangle.toString());
        
    }
    
}
