package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int state1 = 502;
        int state2 = 100;
        int state3 = 200;
        int state4 = 230;

        int[] statePopulation =  new int[5];

        System.out.println(statePopulation);

        statePopulation[0] = 234;
        statePopulation[1] = 230;
        statePopulation[2] = 200;
        statePopulation[3] = 100;
        statePopulation[4] = 405;

        for(int i=0; i < statePopulation.length; i++){

            System.out.println("statePopulation["+ i+ "]" + statePopulation[i]);
        }
    }
}
