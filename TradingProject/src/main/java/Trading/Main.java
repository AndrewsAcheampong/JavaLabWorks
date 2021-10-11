package Trading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //object of students
//        List<Double> student1 = new ArrayList<>();
        Student student1 = new Student(List.of(40.00,50.00,60.00));
        Student student2 = new Student(List.of(40.00,50.00,60.00));
        Student student3 = new Student(List.of(40.00,50.00,60.00));

        student1.setName("Andydorsty");
        student2.setName("Alfredo");
        student3.setName("Evelyn");
        System.out.println(student1.getAverageGrade());


        //object for Lecture Class
        Lecture lecture = new Lecture();
        System.out.println(lecture.getHighestAverageGrade());
        lecture.enter(student1); //Entering a student into

        //create an Object for naughtyStudent
        Student nstudent1 = new NaughtyStudent(List.of(50.00,80.00));
        System.out.println(nstudent1.getAverageGrade());

        // A code to get the student according to a particular level
        Register register = new Register(List.of(student1, student2, student3));
        register.getRegisterByLevel(Level.FOUR);
        register.printReport();
    }
}
