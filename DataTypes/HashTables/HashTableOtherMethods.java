// what is Hash Table in Java?
// let's find out part.2
import java.util.Enumeration;
import java.util.Hashtable;
public class HashTableOtherMethods {
    public static void main(String[] args) {
        System.out.println("---< Hash Table in Java >---\n");

        // let's create hashtable initial capacity 4 and loadFactor 0.9f
        Hashtable<Integer, String> ht = new Hashtable<>(4,0.9f);

        // and add some values using .put(key, value)
        ht.put(1, "Know");
        ht.put(2, "I don't");
        ht.put(3, "Hmm");
        ht.put(4, "?");
        ht.put(5, "this");
        ht.put(6, "is");
        ht.put(7, "What");
        System.out.println("hash table -> " + ht + "\n");

        // 8. .elements() - used to get the enumeration of the values present in the hashtable
        System.out.println("8. .elements() - used to get the enumeration of the values present in the hashtable ->");
        // let's create enumeration to store hashtable elements
        Enumeration<String> en = ht.elements();
        System.out.println("enumeration of the elements -> ");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + ", ");
        }
        System.out.println("\n");

        // 9. .get(Object key) - Returns the value to which the specified key is mapped
        System.out.println("9. .get(Object key) - Returns the value to which the specified key is mapped ->");
        System.out.println("key \"3\" value -> " + ht.get(2) + "\n");

        // 10. .size() - returns the number of keys in this hashtable
        System.out.println("10. .size() - returns the number of keys in this hashtable ->");
        System.out.println("size of the hashtable -> " + ht.size() + "\n");

        // 11. .values() - Returns a Collection view of the values contained in this hashtable
        System.out.println("11. .values() - Returns a Collection view of the values contained in this hashtable ->");
        System.out.println("hast table Collection view -> " + ht.values() + "\n");

        // 12. .clear() - Clears this hash table so that it contains no keys
        System.out.println("12. .clear() - Clears this hash table so that it contains no keys ->\n");
        ht.clear();

        // 13. .isEmpty() - Tests if this hashtable no keys to values
        System.out.println("13. .isEmpty() - Tests if this hashtable no keys to values ->");
        System.out.println("is hashtable Empty? -> " + ht.isEmpty());
    }
}
