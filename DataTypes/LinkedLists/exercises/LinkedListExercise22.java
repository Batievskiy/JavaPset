import java.util.LinkedList;
import java.util.Random;

// 22. Write a Java program to check if
// a particular element exists in a linked list.
public class LinkedListExercise22 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getRandString());
        }
        System.out.println(linkedList);

        String element = linkedList.get(4);
        boolean isExist = linkedList.contains(element);
        System.out.printf("contains %s ? -> %s", element, isExist);
    }

    private static String getRandString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
        }
        return sb.toString();
    }
}
