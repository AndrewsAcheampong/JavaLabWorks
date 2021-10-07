package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Math.random());
        double rand = Math.random();
        System.out.println(" "+ rand);

        double n = (int)(Math.random()*10+2);
        System.out.println(n);

       System.out.println(ThreadLocalRandom.current().nextInt() + " This number is an integer");


    }
}
