import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectorsBasics {
    public static void main(String[] args) {

        // Collectors.toList() - converting the Stream into the List
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList,"Hello", "Java", "World");

        List<String> stringList = stringArrayList.stream()
                // filtering only strings with first character in UpperCase
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                // and collecting them into the List
                .collect(Collectors.toList());

        // Collectors.toSet() - converting the Stream into the Set
        Set<String> stringSet = stringArrayList.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toSet());

        // Collectors.toMap() - converting the Stream into the Map
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        Collections.addAll(stringArrayList1,
                "q=113", "w=119", "e=101", "r=114", "t=116", "y=121", "z==z");
        Map<String, String> stringMap = stringArrayList1.stream()
                // converting each line into the Array by splitting them using RegEx "="
                .map(e -> e.split("="))
                // filtering elements that contains two parts only
                .filter(e -> e.length == 2)
                // sending two functions - first is returns Key, second is returns Value
                .collect(Collectors.toMap(e -> e[0], e-> e[1]));

        // Collectors.joining() - joining all the elements of the Stream into one String
        String stringJoinedFromArrayList = stringArrayList1.stream()
                .collect(Collectors.joining(", "));
        // another way of joining:
        stringJoinedFromArrayList = String.join(", ", stringArrayList);
    }
}
