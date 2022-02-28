package com.mycompany.transcriptproject;

import java.util.Random;

/**
 *
 * @author family
 */
public class TranscriptDriver {
    public static void main(String[] args) {
        // TODO code application logic here
        //build a transcript with five courses
        Transcript testTranscript = new Transcript(5);
        System.out.println("The GPA is " + testTranscript.getGPA());
        
        //Let's build transcripts for a whole bunch of students
        final int NSTUDENTS = 10;
        Transcript[] studentTranscripts = new Transcript[NSTUDENTS];
        Random rand = new Random();
        
        //We have to build each Transcript object
        //We'll use a random number of courses
        for (int i = 0; i < NSTUDENTS; i++){
            studentTranscripts[i] = new Transcript(rand.nextInt(3, 7));
        }
        System.out.println("The transcript array hash is: " 
                + studentTranscripts.hashCode());
        
        //Let's build a table of grades
        //we are instantiating this as an array of NSTUDETNS rows
        //but no olumns yet
        Grade.Grades[][] studentGrades = new Grade.Grades[NSTUDENTS][];
        //Each Transcript has a different # of courses
        //so each row will have a different number of columns
        for (int i = 0; i < NSTUDENTS; i ++){
            int nCourses = studentTranscripts[i].getnCourses();
            //The ith row has nCourses columns
            studentGrades[i] = new Grade.Grades[nCourses];
            //now put the grades in place: The ith student and the jth grade
            for (int j = 0; j<nCourses; j++){
                studentGrades[i][j] = studentTranscripts[i].getCourses()[j].getGrade();
            }
        }
        
        //print out the array
        for (int iRow = 0; iRow < NSTUDENTS; iRow++){
            for (int iColumn = 0; iColumn < studentGrades[iRow].length; iColumn++){
                Grade.Grades grade = studentGrades[iRow][iColumn];
                System.out.print(grade + "\t");
            }
            System.out.println(studentTranscripts[iRow].getGPA());
            System.out.println();
        }
        
    }
    
}
