package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo2 {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList ("BMW" , "Toyota" , "Benz" , "Range Rover" , "Vitz");
        List<Integer> modifiedVehicles = new ArrayList<>();

        //get the length of all the cars in the list
        modifiedVehicles = vehicles.stream().map(String::length).collect(Collectors.toList());
        System.out.println(modifiedVehicles);

        List<Integer> numberList = Arrays.asList(2 ,3 ,4 ,5, 6 , 8);
        numberList.stream().map(n -> n * 3).forEach(n -> System.out.println(n));


    }

}
