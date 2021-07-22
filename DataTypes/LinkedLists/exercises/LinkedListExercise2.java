// 2. Write a Java program to iterate
// through all elements in a linked list.
import java.util.LinkedList;
import java.util.Random;

public class LinkedListExercise2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(getRandomString());
        }
        // iterate through list
        int i = 1;
        for (String string : linkedList) {
            System.out.print(string);
            if (i > 9) {
                break;
            }
            System.out.print(", ");
            i++;
        }

    }

    private static String getRandomString() {
        Random random = new Random();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 3; i++) {
            char c1 = (char) ('a' + (char)random.nextInt(26));
            result.append(c1);
        }
        return result.toString();
    }
}
