package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {

    public static void main(String[] args){

//        ArrayList<Integer> numberList = new ArrayList<Integer>();
//        numberList.add(2);
//        numberList.add(3);
//        numberList.add(4);
//        numberList.add(5);

        //dynamically adding multiple lists in an object
        List<Integer> numbers = Arrays.asList(12,34,5,1,2,3,4,56);

        //Creating an empty arrayList to hold the defined codes
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        //        for(int n: numbers){
//            if (n % 2 == 0) {
//                System.out.println(n);
//                evenNumbers.add(n);
//            }
//        }


        //fetch out all the even numbers from the list
        evenNumbers = (ArrayList<Integer>) numbers.stream().filter(n -> n.intValue() % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //call the values right from the stream
        numbers.stream().filter(n->n %2 == 0).forEach(n-> System.out.println(n));

    }
}
