package com.mycompany.transcriptproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author family
 */
public class Transcript {
    private Course[] courses;
    private int nCourses;
    private int nCredits;
    private double GPA;
    
    //Construct a Transcript object with a number of random Course objects
    public Transcript(int nCourses){
        this.nCourses = nCourses;
        //now we can intantiate the courses array
        courses = new Course[nCourses];
        //but we also have to instantiate each Course object in the array
        
//        for (Course course:courses){
//            course = new Course();
//        }
        
        for (int i = 0; i< nCourses; i++){
            courses[i] = new Course();
        }
        calculateGPA();
    }
    
    //Because the Transcript object should always ubdate its own GPA,
    //this method can be private
    
    private void calculateGPA(){
        GPA = 0;
        nCredits = 0;
        
        for (Course course : courses){
            double grade = course.getGrade().getValue();
            int courseCredits = course.getCredits();
            GPA += grade * courseCredits;
            nCredits += courseCredits;
        }
        GPA /= nCredits;
    }

    public Course[] getCourses() {
        return courses;
    }

    public int getnCourses() {
        return nCourses;
    }

    public int getnCredits() {
        return nCredits;
    }

    public double getGPA() {
        return GPA;
    }
    
    
}
