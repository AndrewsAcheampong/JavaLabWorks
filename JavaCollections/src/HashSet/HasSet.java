package HashSet;

import java.util.HashSet;

public class HasSet {

    public static void main(String[] args) {

        //Creating a new HashSet
        HashSet hs = new HashSet(); //Creates a hashset with initial size of 16 and load factor of 0.75

        //Customizing HashSet
        HashSet hs1 = new HashSet(100);

        hs1.add("Animals");
        hs1.add("Amazing");
        hs1.add(9);
        hs1.add(true);
        hs1.add(null);

        //print out all hashSet Values
        System.out.println(hs1);

        //remove object =from the hashset by index
        hs1.remove("Animals");
        System.out.println("Output after removing index 2 " + hs1);

        //to check if the hashset contains a value
        System.out.println(hs1.contains(9));


    }
}
