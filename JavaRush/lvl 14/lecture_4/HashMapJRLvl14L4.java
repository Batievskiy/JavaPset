import java.util.HashMap;
import java.util.Set;

// JavaRush lvl 14 lecture 4 HashMap
public class HashMapJRLvl14L4 {
    public static void main(String[] args) {

        // create: HashMap<keyType, valueType> name = new HashMap<>();
        HashMap<String, Integer> hashMapSI = new HashMap<>();
        HashMap<Integer, String> hashMapIS = new HashMap<>();

        // add elements: .put(key, value)
        hashMapSI.put("one", 1);
        hashMapSI.put("two", 2);
        hashMapSI.put("three", 3);
        hashMapIS.put(1, "hello");
        hashMapIS.put(2, "java");
        hashMapIS.put(3, "world");

        System.out.println("hashMap String-Integer -> " + hashMapSI);
        System.out.println("hashMap Integer-String -> " + hashMapIS);
        System.out.println();

        // .get(key) - get element by its key
        System.out.println("String-Integer \"one\" -> " + hashMapSI.get("one"));
        System.out.println("Integer-String \"1\" -> " + hashMapIS.get(1));
        System.out.println();

        // traverse elements using for each loop
        System.out.println("traverse hashMapSI:");
        for (String key : hashMapSI.keySet()) {
            Integer value = hashMapSI.get(key);
            System.out.println("key: " + key + " -> value: " + value);
        }
        System.out.println();

        // another way
        System.out.println("traverse hashMapIS:");
        Set<Integer> keys = hashMapIS.keySet();
        for (Integer key : keys) {
            String string = hashMapIS.get(key);
            System.out.println("key: " + key + " -> value: " + string);
        }
        System.out.println();
    }
}
