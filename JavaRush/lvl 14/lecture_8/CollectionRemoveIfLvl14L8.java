import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveIfLvl14L8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("original -> " + numbers);
        numbers.removeIf(s -> s > 5);
        System.out.println("after removing -> " + numbers);
    }
}
