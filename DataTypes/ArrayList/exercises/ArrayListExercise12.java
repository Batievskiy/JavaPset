// 12. Write a Java program to extract a portion of a array list

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExercise12 {
    public static void main(String[] args) {
        ArrayList<Character> alc = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            alc.add(getRandChar());
        }
        System.out.println("random alc -> " + alc);
        // cut off a part of the ArrayList using .subList().
        List<Character> subList = alc.subList(0, 5);
        System.out.println("part of the alc -> " + subList);

    }
    private static Character getRandChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }
}
