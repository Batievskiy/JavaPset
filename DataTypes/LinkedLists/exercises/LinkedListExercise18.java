import java.util.LinkedList;

// 17. Write a Java program to join two linked lists.
public class LinkedListExercise18 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        System.out.println("1st -> " + linkedList);

        // clone
        LinkedList<String> clone = (LinkedList) linkedList.clone();
        System.out.println("clone -> " + clone);
    }
}
