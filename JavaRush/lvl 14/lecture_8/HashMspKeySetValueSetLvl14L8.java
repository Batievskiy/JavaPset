import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMspKeySetValueSetLvl14L8 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(123, "God of War");
        passportsAndNames.put(456, "Nathan Drake");
        passportsAndNames.put(789, "Prince of Persia");

        // let's save keys
        Set<Integer> keysPassportsAndNames = passportsAndNames.keySet();
        System.out.println("keys -> " + keysPassportsAndNames);

        // let's save values
        ArrayList<String> valuesPassportsAndNames = new ArrayList<>(passportsAndNames.values());
        System.out.println("names -> " + valuesPassportsAndNames);

        // let's traverse through entries
        for (Map.Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }
    }
}
