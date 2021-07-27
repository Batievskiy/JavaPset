import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableForEachLvl14L8 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        // integers.forEach(s -> integers.add(s + 1)); // <--- Thrown the ConcurrentModificationException.
        
        // Iterable.forEach(Consumer action) for printing values
        integers.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
