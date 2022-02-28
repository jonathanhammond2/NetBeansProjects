package com.mycompany.mavenproject1;

import java.text.DecimalFormat;


public class Sphere extends Circle{
    
    DecimalFormat fmt = new DecimalFormat("0.##");
    
    public Sphere(String color, double radius){
        super(color, radius); //calls the circle's constructor which in turn
        //calls the Shape's constructor. 
        System.out.println("The Sphere constructor is called;");
        this.radius = radius;
        this.dim = dimension.threeDimensional.name();
        
    }

    public void setFmt(DecimalFormat fmt) {
        this.fmt = fmt;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public DecimalFormat getFmt() {
        return fmt;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String getDim() {
        return dim;
    }
    
    public double volume(){
        return 4.0*Math.PI*Math.pow(radius,3)/3.0;
    }
    
    public double area(){
        return 4*Math.PI*Math.pow(radius,2);
    }
    
    public String toString(){
        System.out.println("Sphere radius: " + radius
                        + ",\nSphere's volume: " + volume()
                        + ",\nSphere's area: " + area()
                        + ",\nSphere is " + dim);
        
        return "Sphere radius: " + radius
                        + ",\nSphere's volume: " + fmt.format(this.volume())
                        + ",\nSphere's area: " + fmt.format(this.area())
                        + ",\nSphere is " + dim;
    }
}
