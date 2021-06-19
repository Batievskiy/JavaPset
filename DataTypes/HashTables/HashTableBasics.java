// what is Hash Table in Java?
// let's find out part.1

import java.util.Hashtable;
import java.util.Map;

public class HashTableBasics {
    public static void main(String[] args) {
        System.out.println("---< Hash Table in Java >---\n");

        /* The Hash Table class implements a hash table,
           which maps keys to values.
           Any non-null object can be used as a key or as a value.
           To successfully store and retrieve objects from a hashtable,
           the objects used as keys must implement the hashCode method and the equals method

            Features of HashTable:
            1. Its similar to HashMap, but is synchronized
            2. HashTable stores keys/values pair in hash table
            3. We can specify an object that is used as a key,
               and the value we want to associate to that stored key.
               The key is then hashed, and the resulting hash code is used as the index
               at which the value is stored within the table
            4. The initial default capacity of Hash Table class is 11 with loadFactor 0.75
            5. Hash Table provides not fail-fast Enumeration.
         */
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        // initialise hash table using capacity and loadFactor
        Hashtable<Integer, String> ht2 = new Hashtable<>(21,0.8f);

        // 1. .put() - used to add an element to the hash table
        System.out.println("1. .put() - used to add an element to the hash table ->");

        ht1.put(1, "World");
        ht1.put(2, ", ");
        ht1.put(3, "Hello");

        ht2.put(1, "Java");
        ht2.put(2, " love ");
        ht2.put(3, "I");

        System.out.println("hast table 1 -> " + ht1);
        System.out.println("hash table 2 -> " + ht2);
        System.out.println();

        // 2. .put(key, value) - used to change the element at particular key
        System.out.println("2. .put(key, value) - used to change the element at particular key ->");
        ht1.put(1, "Reader");
        System.out.println("hash table 1 -> " + ht1);
        ht2.put(3, "We");
        System.out.println("hash table 2 -> " + ht2);
        System.out.println();

        // 3. Traverse through hash table using enhanced for loop
        System.out.println("3. Traverse through hash table using enhanced for loop ->");
        for (Map.Entry<Integer, String> entry : ht1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        // 4. .remove() - used to remove an element from the hash table
        System.out.println("4. .remove() - used to remove an element from the hash table ->");
        System.out.println("hash table 1 -> " + ht1);
        System.out.println("removed element -> " + ht1.remove(1));
        System.out.println("hash table 1 -> " + ht1 + "\n");

        // 5. .clone() - return a shallow copy of the mentioned hashtable
        System.out.println("5. .clone() - return a shallow copy of the mentioned hashtable ->");
        System.out.println("cloned hashtable -> " + ht1.clone() + "\n");

        // 6. .contains(Object value) or .containsValue(Object value) - check is the value exist in the hashtable
        // return True or False
        System.out.println("6. .contains(Object value) or .containsValue(Object value)\n - check is the value exist in the hashtable ->");
        System.out.println("hash table 1 -> " + ht1);
        System.out.println("hash table 2 -> " + ht2);
        System.out.println("is \"Hmm\" present? -> " + ht1.contains("Hmm"));
        System.out.println("is \"Java\" present? -> " + ht2.containsValue("Java") + "\n");

        // 7. .containsKey(Object key) - check is the key present in hash table
        System.out.println("7. .containsKey(Object key) - check is the key present in hash table ->");
        System.out.println("hash table 1 -> " + ht1);
        System.out.println("hash table 2 -> " + ht2);
        System.out.println("is \"3\" key present? -> " + ht1.containsKey(3));
        System.out.println("is \"8\" key present? -> " + ht2.containsKey(8) + "\n");

        // see you in next -> HashTableOtherMethods.java
    }
}
