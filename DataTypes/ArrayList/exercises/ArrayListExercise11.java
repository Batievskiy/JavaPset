// 11. Write a Java program to reverse elements in a array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListExercise11 {
    public static void main(String[] args) {
        ArrayList<Character> acl = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            acl.add(getRandChar());
        }
        System.out.println("random chars in als -> " + acl);
        // reverse using Collections
        Collections.reverse(acl);
        System.out.println("reversed als -> " + acl);
    }

    private static Character getRandChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26)); // chars from a to z
    }
}
