package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo3 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Monday" , "Tensil" , null , "Pencil", null);

        //Empty list to accept the null values
        List<String> nulling = Arrays.asList();

        nulling = words.stream().filter(n -> n != null).collect(Collectors.toList());
        System.out.println(nulling);

        words.stream().filter(a -> a == null).forEach(System.out::println);


    }

}
