package com.mycompany.inheritanceexample.guilfordcollege;

public class CollegeEmployee {
    String name; //protected is an access modifier; can only be accessed by 
    //other classes in the same package.
    private int gNum;
    private Address address;
    
    /**
     * CollegeEmployee constructor
     * @param empName
     * @param empGnum 
     */
    
    
    //Constructor sets up this College employee with the specified information
    public CollegeEmployee (String empName, int empGnum)
    {
        this.name = empName;
        this.gNum = empGnum;
    }

    public String getName() {
        return name;
    }

    public int getgNum() {
        return gNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setgNum(int gNum) {
        this.gNum = gNum;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //----------------------------------------------------------
    
    //Print a message appropritae for this employee
    public void work()
    {
        System.out.println(name + " works for Guilford College.");
    }

    @Override
    public String toString() {
        return "CollegeEmployee{" + "name=" + name + ", gNum=" + gNum + ", address=" + address + '}';
    }
    
    
}
