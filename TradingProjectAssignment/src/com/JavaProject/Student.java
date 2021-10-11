package com.JavaProject;

import java.util.List;

    public class Student implements Nameable,HasLevel {
        private List<Double> grades;
        private String name;
        private Level level;

        //this is used to set a name for the name property
        public void setName(String name) {
            this.name = name;
        }


        public Student(List<Double> grades) {
            this.grades = grades;
        }


        public double getAverageGrade(){
            double averageGrade = 0;
            for(double grade : grades){
                averageGrade += grade;
            }
            return averageGrade;
        }

        // this implements the getName() method in the Interface
        @Override
        public String getName() {
            return name;
        }

        //setter
        public void setLevel(Level level) {
            this.level = level;
        }

        @Override
        public Level getLevel() {
            return level;
        }
    }

}
