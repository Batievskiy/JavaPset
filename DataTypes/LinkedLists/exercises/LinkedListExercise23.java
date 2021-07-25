import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

// 23. Write a Java program to convert
// a linked list to array list
public class LinkedListExercise23 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getRandString(3));
        }
        System.out.println("linkedList -> " + linkedList);

        // conversion
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("arrayList -> " + arrayList);


    }

    private static String getRandString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
        }
        return sb.toString();
    }
}
