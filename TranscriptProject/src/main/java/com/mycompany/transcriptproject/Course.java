package com.mycompany.transcriptproject;


import com.mycompany.transcriptproject.Grade;
import java.util.Random;


public class Course {
    private String name;
    private int number;
    private String instructor;
    private String location;
    private int credits;
    private int section;
    private Grade.Grades grade;
    private Random rand = new Random();

    public Course(String name, int number, String instructor, String location, int credits, int section, Grade.Grades grade) {
        this.name = name;
        this.number = number;
        this.instructor = instructor;
        this.location = location;
        this.credits = credits;
        this.section = section;
        this.grade = grade;
    }
    public Course() {
       grade = Grade.randomGrade();
       credits = rand.nextInt(4) + 1;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public Grade.Grades getGrade() {
        return grade;
    }

    public void setGrade(Grade.Grades grade) {
        this.grade = grade;
    }
    

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", number=" 
                + number + ", instructor=" + instructor 
                + ", location=" + location + ", credits=" 
                + credits + ", section=" + section + ", grade=" + grade + '}';
    }
    
    
    
}
