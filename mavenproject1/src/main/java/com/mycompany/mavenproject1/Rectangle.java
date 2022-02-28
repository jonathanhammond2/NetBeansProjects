package com.mycompany.mavenproject1;

class Rectangle extends Shape{
    double length;
    double width;
    
    //An abstract class can contain constructors and a constructor of 
    //abstract class is called when an instance if an inherited class is created.
    
    public Rectangle (String col, double length, double width){
        //calls the abstract class shape constructor
        super(col); //passes String col to the super class (Shape class with parameter of col)
        System.out.println("Rectangle constructor is called;");
        
        this.dim = dimension.twoDimensional.name();
        this.width = width;
        this.length = length;
    }
    
    @Override double area(){
        return length*width;
    }
    
    @Override double perimeter(){
        return 2*(length+width);
    }
    
    @Override public String toString(){
        return "Rectangle color: " + super.getColor()
                + ",\nRectangle area: " + area()
                + ",\nRectangle perimeter: " + perimeter()
                + ", \nRectangle is: " + dim;        
    }
    
}
