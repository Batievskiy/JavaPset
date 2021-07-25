import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// JavaRush lvl 14 lecture 4 HashMap Entry class
public class HashMapEntryJRLvl14L4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMapIS = new HashMap<>();
        hashMapIS.put(1, "one");
        hashMapIS.put(2, "two");
        hashMapIS.put(3, "three");
        System.out.println("hashMapIS -> " + hashMapIS);

        Set<Map.Entry<Integer, String>> entries = hashMapIS.entrySet();
        // traverse
        for (Map.Entry<Integer, String> pair : entries) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println("key: " + key + " -> value: " + value);
        }
        System.out.println();

        // little bit shorter:
        for (Map.Entry<Integer, String> pair : hashMapIS.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println("key: " + key + " -> value: " + value);
        }
        System.out.println();

        // or shortest - using "var":
        for (var pair : hashMapIS.entrySet()) {
            var key = pair.getKey();
            var value = pair.getValue();
            System.out.println(key + " -> " + value);
        }
        System.out.println();

        // values only:
        for (String value : hashMapIS.values()) {
            System.out.println(value);
        }
    }
}
// class Entry looks like this:
class Entry<KeyType, ValueType> {
    private KeyType key;
    private ValueType value;

    public KeyType getKey() {
        return this.key;
    }

    public ValueType getValue() {
        return this.value;
    }
}
