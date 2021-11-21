package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private int sid;
    char grade;

    Student(String name , int sid , char grade){
        this.name = name;
        this.sid  = sid;
        this.grade = grade;
    }

    public static void main(String[] args) {

        //Object of the Student Class
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Andydorsty" , 100 , 'A'));
        studentList.add(new Student("Kwaakye" , 101 , 'B'));
        studentList.add(new Student("Jeffery" , 102 , 'B'));
        studentList.add(new Student("Mandeka" , 103 , 'C'));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Mandy" , 200 , 'D'));
        studentList2.add(new Student("Kofi" , 201 , 'C'));
        studentList2.add(new Student("Jerem" , 202 , 'B'));
        studentList2.add(new Student("Huss" , 203 , 'F'));

        //List of all the Lists
        List<List<Student>> allStudents = Arrays.asList(studentList , studentList2);
        System.out.println(allStudents.stream().flatMap(s -> s.stream().map( n -> n.name)).collect(Collectors.toList()));


    }


}
