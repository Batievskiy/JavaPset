import java.util.LinkedList;

// 17. Write a Java program to join two linked lists.
public class LinkedListExercise17 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("four");
        linkedList2.add("five");
        linkedList2.add("six");
        System.out.println("1st -> " + linkedList);
        System.out.println("2nd -> " + linkedList2);

        // join lists
        LinkedList<String> result = new LinkedList<>(linkedList);
        result.addAll(linkedList2);
        System.out.println("joined -> " + result);

    }
}
