package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Person> people = getPeople();

        List<Person> females = new ArrayList<>();
        List<Person> males = new ArrayList<>();

        //Filter
        females = people.stream().filter(person -> person.getGender().equals(Gender.female)).collect(Collectors.toList());
        System.out.println(females);

        males = people.stream().filter(person -> person.getGender().equals(Gender.male)).collect(Collectors.toList());
        System.out.println(males);


    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Andydorsty",23,Gender.male),
                new Person("Francisca", 24,Gender.female),
                new Person("Alfred", 22, Gender.male)
        );
    }
}