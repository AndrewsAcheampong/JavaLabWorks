package Trading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();

    public void enter(Student student){
        students.add(student);
    }

    public double getHighestAverageGrade(){
        // a list
        List<Double> averageGrades = new ArrayList<>();
        for(Student student : students){
            double grade = student.getAverageGrade();
            averageGrades.add(grade);
        }
        Collections.sort(averageGrades); //this is done to sort the grades in ascending order
        return averageGrades.get(averageGrades.size() - 1); //creates to get the highest value in the various grades
    }
}
