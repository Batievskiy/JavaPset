// what is a Map in Java?
// let's find out

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class MapBasics {
    public static void main(String[] args) {
        System.out.println("---< Map in Java >---\n");

        /* Map is a data structure
           that stores data in Key / Value pairs
           where every Key is unique
           A Map is sometimes called an associative array or dictionary
           It is often used for fast look-ups of data, for example:

           keys     values
           Jan......31
           Feb......30
           ...
           Apr......30
        */
        //  Key.....Value....Name..........Map type () - default capacity of 16
        Map<Integer, String> daysMap = new HashMap<>();

        // 1. .put(key, value) - Adding elements
        // Insertion order is not retained in the hashmap
        System.out.println("1. .put(key, value) - Adding elements ->");
        daysMap.put(1, "Jan");
        daysMap.put(2, "Feb");
        daysMap.put(3, "Mar");
        System.out.println("daysMap -> " + daysMap + "\n");

        // 2. .put(key, value) - used for Changing element
        System.out.println("2. .put(key, value) - used for Changing element ->");
        daysMap.put(1, "CHANGED!"); // change value
        daysMap.put(4, "ADDED"); // added value with key `4`
        System.out.println("daysMap after changing -> " + daysMap + "\n");

        // 3. .remove() - to Remove an element from the Map using its Key
        System.out.println("3. .remove(key) - to Remove an element from the Map ->");
        daysMap.remove(1);
        System.out.println("daysMap after removing -> " + daysMap + "\n");

        // 4. Iterating through the Map using `for-each loop`
        System.out.println("4. Iterating through the Map using `for-each loop` ->");
        System.out.println("key : value");
        for (Map.Entry<Integer, String> entry : daysMap.entrySet()) {
            int key = entry.getKey();
            // let's find the value
            String value = entry.getValue();
            // and print out
            System.out.println("  " + key + " : " + value);
        }
        System.out.println();

        // 5. Iterating through the Map using .iterator()
        System.out.println("5. Iterating through the Map using .iterator() ->");
        System.out.println("key : value");
        Iterator<Map.Entry<Integer, String>> itr = daysMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("  " + key + " : " + value);
        }
        System.out.println();
    }
}
