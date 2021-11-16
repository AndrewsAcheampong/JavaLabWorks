package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

class Linked {
    
    public static void main(String[] args) {

        //Creating a LinkedList
        LinkedList li = new LinkedList();
        li.add("Andydorsty");
        li.add(true);
        li.add(7);
        li.add("Amazing");

        System.out.println(li);

        //print size of the linkedList
        System.out.println(li.size());

        //remove an item from the LinkedList
        li.remove(1);
        System.out.println("Output after removing the value in index 1 " +  li);

        //removing an item by value
        li.remove("Andydorsty");
        System.out.println("Output after removing the value in index 1 " + li);

        //adding elemement in the middle of linkedList
        li.add(0 , "Success");
        System.out.println("output after adding a value " + li);

        //LinkedList special methods
        li.addFirst("Unprecedented");
        System.out.println("Output after adding the element first " + li);

        li.addLast("Unimaginable");
        System.out.println("Output after adding the element last " + li );

        //Retrieving data from the LinkedList
        Iterator it = li.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());
        }

    }
}
