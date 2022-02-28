
package com.mycompany.inheritanceexample.guilfordcollege;

/**
 *
 * @author family
 */
public class Admin extends CollegeEmployee{
    //the diamond problem - cannot extend two classes which are from same hierchy
    //workaaround by using implements, but that's also a bit different
    
    protected String department;
    
    public Admin (String empN, int empNum, String dept)
    {
        super(empN, empNum);
        this.department = dept;
        
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    //--------------------------------------------------------------------------
    
    
    public String toString(){
        return super.toString() + " works in " + department;
    }
    
    //print a message appropriate for this administrator
    public void administrate(){
        System.out.println(name + " works in the " + department);
    }
    
    
}
