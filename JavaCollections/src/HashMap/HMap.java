package HashMap;

import java.util.HashMap;

public class HMap {

    public static void main(String[] args) {

        //Initiating a HashMap
        HashMap<Integer , String> hm = new HashMap();

        //adding a pair in the hashMap
        hm.put(1 , " Andydorsty");
        hm.put(2 , " Alfred");
        hm.put(3 , " Samuel");
        hm.put(4 , " Justice");
        hm.put(5 , " Johnny");

        System.out.println(hm);

        //getting a value using key
        System.out.println(hm.get(2));
        
        //removing calue from the mapList
        hm.remove(3);

        System.out.println("Print value after removing key 3 " + hm);

        //Check if hashMap contains a value
        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsValue("Johnny"));

        //Check if hashMap is empty
        System.out.println(hm.isEmpty());

        //Get all keyset from the Map
        System.out.println(hm.keySet());

        //Get all values from the Map
        System.out.println(hm.values());

        //Get all the entries from the Map
        System.out.println(hm.entrySet());

    }
}
