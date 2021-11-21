package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {

    public static void main(String[] args){

        List<String> vehicles = Arrays.asList ("BMW" , "Toyota" , "Benz" , "Range Rover" , "Vitz");
        List<String> modifiedVehicles = new ArrayList<>();

        //Using for loop to apply values to a particular list
        System.out.println(vehicles);

        modifiedVehicles = vehicles.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(modifiedVehicles);


    }

}
