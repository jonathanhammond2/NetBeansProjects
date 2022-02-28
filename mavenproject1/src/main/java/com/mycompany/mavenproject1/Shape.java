
package com.mycompany.mavenproject1;
 
abstract class Shape {
    String color;
    
    enum dimension {twoDimensional, threeDimensional};
    String dim;
    
    abstract double area(); //area() is an abstract method
    abstract double perimeter();
    
    //Note that abscrat methods does not need to be developed in the absract class
    
    //an instance of an abscract class can not be created
    
    //abscract class can have a conscrutor
    
    public abstract String toString();
    
    public Shape (String col)
    {
        System.out.println("The Shape consructor is called;");
        this.color = col;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    static void staticfunc(){
        System.out.println("This 'static staticfunc method"
                + "could not be called without instantiating an object");
    }
    
    final void func(){
        System.out.println("This 'final' func could not be"
                + "overwritten in any extended class)");
    }
            
}
