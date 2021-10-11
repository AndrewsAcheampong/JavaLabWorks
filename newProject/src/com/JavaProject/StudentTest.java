package com.JavaProject;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getAverageGrade() {

        List<Double> grades = new ArrayList<>();

        grades.add(60.00);
        grades.add(50.00);
        grades.add(40.00);

        Student student = new Student(grades);
        assertEquals(50,student.getAverageGrade());

    }
}