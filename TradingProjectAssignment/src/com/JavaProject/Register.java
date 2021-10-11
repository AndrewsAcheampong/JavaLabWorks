package com.JavaProject;

import java.util.ArrayList;
import java.util.List;

public class Register {

    package Trading;

import java.util.ArrayList;
import java.util.List;

    public class Register  {
        private List<Nameable> nameables;
        private Student student;

        public Register(List<Nameable> nameables){

            this.nameables = nameables;
        }

        public List<String> getRegister(){
            List<String> s = new ArrayList<>();
            for(Nameable n : nameables) {
                s.add(n.getName());
            }
            return s;
        }

        //code to return list of students based on levels
        public List<String> getRegisterByLevel(Level level){
            List<String> names = new ArrayList<>();

            for(Nameable n : nameables){
                if(((Student)n).getLevel().equals(level)){
                    names.add(n.getName());
                }
            }
            return names;

        }
    }


}
