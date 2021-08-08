import java.util.Comparator;
import java.util.TreeMap;

// 7. Write a Java program
// to sort keys in Tree Map by using comparator
public class TreeMapExercise7 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>(new sortKey());
        treeMap.put("1", "one");
        treeMap.put("2", "two");
        treeMap.put("3", "tree");
        treeMap.put("4", "four");
        treeMap.put("5", "five");
        System.out.println("treeMap -> " + treeMap);
    }
}
class sortKey implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
