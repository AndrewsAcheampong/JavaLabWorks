package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo2 {

    public static void main(String[] args){

        List<String> names = Arrays.asList("Andydorsty" , "Alfredo" , "Gyenny" , "Bismark" , "Christiana");

        //Print all names that are greater than 6 but less than 8
        System.out.println(names.stream().filter(n -> n.length() >= 6 && n.length() <= 8).collect(Collectors.toList()));

    }

}
