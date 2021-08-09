import java.util.TreeMap;

// 12. Write a Java program
// to get the greatest key
// less than or equal to the given key.

public class TreeMapExercise12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("treeMap -> " + treeMap);

        System.out.println(".floorKey(30) -> " + treeMap.floorKey(30));
        System.out.println(".floorKey(70) -> " + treeMap.floorKey(70));
        System.out.println(".floorKey(40) -> " + treeMap.floorKey(40));
    }
}
