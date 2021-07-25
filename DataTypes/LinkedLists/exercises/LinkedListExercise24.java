import java.util.LinkedList;

// 24. Write a Java program to compare two linked lists
public class LinkedListExercise24 {
    public static void main(String[] args) {
        LinkedList<String > linkedList1 = new LinkedList();
        LinkedList<String > linkedList2 = new LinkedList();

        linkedList1.add("hello");
        linkedList1.add("java");
        linkedList1.add("world");

        linkedList2.add("hello");
        linkedList2.add("java");
        linkedList1.add("world");

        LinkedList<String> linkedList3 = new LinkedList();
        for (String string : linkedList1) {
            linkedList3.add(linkedList2.contains(string) ? "Yes" : "No");
        }
        System.out.println("compared -> " + linkedList3);
    }
}
