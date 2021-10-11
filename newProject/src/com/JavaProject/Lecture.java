package com.JavaProject;

import java.util.*;

public class Lecture {

    List<Student> studentlist = new ArrayList<>();
    List<Double> averageGrades = new ArrayList<>();

    public void enter(Student student){
        studentlist.add(student);
        averageGrades.add(student.getAverageGrade());
    }

//    public double getHighestAverageGrade(){
//        Collections.sort(averageGrades);
//        return averageGrades.get(averageGrades.size() - 1);
//
//    }

    public Map<Student, Double> getHighestAverageGrade(){
    double highestAverage = 0;
    Map<Student, Double>  total = new HashMap<>();
        for(Student student : studentlist){
            double value = student.getAverageGrade();
            if(value> highestAverage){
                highestAverage = value;
            }
            total.put(student, highestAverage);
        }
        return total;
    }


}
