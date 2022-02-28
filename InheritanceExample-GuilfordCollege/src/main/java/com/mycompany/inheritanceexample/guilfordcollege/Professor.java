package com.mycompany.inheritanceexample.guilfordcollege;

import java.util.Objects;

/**
 *
 * @author family
 */
public class Professor extends CollegeEmployee{
    protected String specialty;
    
    //constructor to set up this professor with the specified information
    public Professor (String empN, int empNum, String special){
        super(empN, empNum);
        this.specialty = special;
        
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSpecialty() {
        return specialty;
    }

    public String getName() {
        return name;
    }
    //--------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.specialty);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        return Objects.equals(this.specialty, other.specialty);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Professor{" + "specialty=" + specialty + '}';
    }
    
    
}
