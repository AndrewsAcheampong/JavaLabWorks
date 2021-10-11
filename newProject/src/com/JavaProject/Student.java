package com.JavaProject;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Double> grades = new ArrayList<>();

    // A constructor for the student class
    public Student(List<Double> grades){
        this.grades = grades;
    }

    public double getAverageGrade() {
       double averageGrade = 0;

       for (double i : grades){
           averageGrade += i;
       }

       averageGrade /= grades.size();
        return (averageGrade);
    }
}
