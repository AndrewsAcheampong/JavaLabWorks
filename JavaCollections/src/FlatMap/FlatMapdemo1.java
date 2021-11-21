package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapdemo1 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1 ,2);
        List<Integer> list2 = Arrays.asList(3 ,4);
        List<Integer> list3 = Arrays.asList(5 ,6);


        List<List<Integer>> finalList = Arrays.asList(list1 , list2 , list3);
        System.out.println(finalList);


        //Flat Mapping the Collection
        List<Integer> newList =  finalList.stream().flatMap(f -> f.stream().map(g -> g * 10)).collect(Collectors.toList());
        System.out.println(newList);

    }

}
