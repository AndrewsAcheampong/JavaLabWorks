package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main (String[] args) {

        //Declaring ArrayList(Opened arrayList)
        ArrayList al = new ArrayList();
        al.add("Andydorsty");
        al.add("Alfred0");
        al.add(10);
        al.add(true);
        al.add(2 , "Andy");

        //print out all the values from the arrayList
        System.out.println(al);

        //print out the size of the arraylist
        System.out.println(al.size());

        //remove the specific value Alfredo
        System.out.println(al.remove("Alfred0"));

        //print out the updated list from the arrayList
        System.out.println("New details in array List after removine the element Alfredo " + al);

        //retrieve a specific value from the arrayList
        System.out.println(al.get(2));

        //To update the value of index 2 to contract
        al.set(2 , "Contract");

        //To check if the value is in the list
        System.out.println(al.contains("Alfredo"));

        //To check if an arrayList is empty or not
        System.out.println(al.isEmpty());


        System.out.println("Print out all the values in the database");
        for( int a = 0;  a <= al.size() ; a++){
            System.out.println(al.get(a));
        }



        //Type Bound ArrayList
        ArrayList<Integer>  aInt = new ArrayList<Integer>();
        aInt.add(34);
        aInt.add(45);
        aInt.add(45);
        aInt.add(1 , 45);

        System.out.println(aInt);

        //The arraylist is a subChild of the list Interface..
        List alNew = new ArrayList();

    }
}
