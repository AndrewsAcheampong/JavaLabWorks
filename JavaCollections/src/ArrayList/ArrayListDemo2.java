package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //Creating a new ArrayList
        ArrayList names =  new ArrayList();

        names.add("Andrews");
        names.add("Alfred");
        names.add("Ankomah");
        names.add("Zinabu");
        names.add("Jeff");
        names.add("Sandra");

         ArrayList naming = new ArrayList();
         naming.addAll(names);

        System.out.println(naming);
        System.out.println(names);

        //sort data in a collection
        Collections.sort(naming);
        Collections.shuffle(naming);
        System.out.println(naming);


    }
}
