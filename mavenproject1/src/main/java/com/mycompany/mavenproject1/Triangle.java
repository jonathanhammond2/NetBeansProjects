package com.mycompany.mavenproject1;

class Triangle extends Shape{
    double a;
    double b;
    double c;
    //An abstract class can contain constructors and a constructor of 
    //abstract class is called when an instance if an inherited class is created.
    
    public Triangle (String col, double a, double b, double c){
        //calls the abstract class shape constructor
        super(col); //passes String col to the super class (Shape class with parameter of col)
        System.out.println("Triangle constructor is called;");
        
        this.dim = Shape.dimension.twoDimensional.name();
        this.a = a;
        this.b= b;
        this.c= c;
        
    }
    
    @Override double area(){
        double sP= perimeter()/2;
        
        return Math.pow(sP*(sP-a)*(sP-b)*(sP-c), 0.5);
    }
    
    @Override double perimeter(){
        return (a + b + c);
    }
    
    @Override public String toString(){
        return "Triangle color: " + super.getColor()
                + ",\nTriangle area: " + area()
                + ",\nTriangle perimeter: " + perimeter()
                + ", \nTriangle is: " + dim;        
    }
    
}
