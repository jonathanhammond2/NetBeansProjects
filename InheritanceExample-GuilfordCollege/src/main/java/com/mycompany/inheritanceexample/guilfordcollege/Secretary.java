package com.mycompany.inheritanceexample.guilfordcollege;

/**
 *
 * @author family
 */
public class Secretary extends Admin{
    protected boolean answering;
    
    
    //constructor

    public Secretary(boolean ans, String empN, int empNum, String dept) {
        super(empN, empNum, dept);
        answering = ans;
    }

    public boolean isAnswering() {
        return answering;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setAnswering(boolean answering) {
        this.answering = answering;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void answer(){
        System.out.print(name + " is ");
        if (!answering){
            System.out.print("not ");
    }
        System.out.println( "answering the phone;");
    }
    
    @Override
    public String toString() {
        return super.toString() + " Secretary{" + "answering=" + answering + '}';
    }
    
    
}
