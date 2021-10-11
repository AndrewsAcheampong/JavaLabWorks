package com.JavaProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        List<Double> grade1 = new ArrayList<>();
//        List<Double> grade2 = new ArrayList<>();

        //Instantiate a student from the NaughtyStudent Class
        NaughtyStudent nstudent = new NaughtyStudent(List.of(55.00,23.00,46.00));
        System.out.println("This is the increased grade " + nstudent.getAverageGrade());


        Student student1 = new Student(List.of(55.00,23.00,46.00));
        Student student2 = new Student(List.of(50.00, 40.00,30.00));

//      Creating an Instance of the Lecture Class
        Lecture lecture =  new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);

        //Code to print out the highestAverageGrade of a Student
        System.out.println("The highestAverage grade for student1 is " + student1.getAverageGrade());

        System.out.println(lecture.getHighestAverageGrade());
        System.out.println("This is the actual grade " + student1.getAverageGrade());
    }
}
