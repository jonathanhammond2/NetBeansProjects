
package com.mycompany.mavenproject1;


class Circle extends Shape{
    double radius;
    
    public Circle (String col, double rad){ //constructor
        //calling the shape constructor
        super(col);
        System.out.println("The Circle constructor is called;");
        this.radius = rad;
       this.dim = dimension.twoDimensional.name();
    }
    
    @Override double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override double perimeter()
    {
        return Math.PI*2*radius;
    }
    
    @Override public String toString(){
        return "Circle color: " + super.getColor()
                + ", \nCircle area: " + area()
                + ", \nCircle perimeter is: " + perimeter()
                + ", \nCircle is: " + dim;
    }
}
