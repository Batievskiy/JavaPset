import java.util.LinkedList;

// what is linked list and how to operate with in in Java?
// let's find out
public class LinkedListBasics {

    public static void main(String[] args) {

        // Linked list is a part of the Collection framework present in java.util.package
        // Linked list is a data structure that is a NODE with data part and address part
        // [data, address to next]-->[data, address to next]-->[data, address to next]-->NULL

        // creating object of the class linked list
        LinkedList<String> linkL = new LinkedList<String>();

        // 1. Adding elements to the LinkedList
        // .add(Object) - is used to add an element at the end of the LinkedList
        // .add(int index, Object) - is used to add an element at a specific index in the LinkedList
        linkL.add("Y");
        linkL.add("E");
        linkL.add("S");
        linkL.add("N");
        linkL.add(4, "O"); // adding into its index
        System.out.println("native filled list: " + linkL);

        // 2. Changing elements in the linkedList
        // .set(int index, Object) - we can change elements, referencing by the index of the element
        linkL.set(1, "OOPS");
        System.out.println("after changing an element: " + linkL);

        // 3. Iterating the LinkedList
        // the most famous is the basic for loop + get() method to get an element at the specific index
        System.out.print("iterating through list: ");
        for (int i = 0; i < linkL.size(); i++) {
            System.out.print(linkL.get(i) + " ");
        }
        System.out.println();

        // 4. Remove some from the LinkedList
        // .remove(Object) - remove an object from the LinkedList
        // (if multiple such objects - remove first occurrence)
        // .remove(int index) - remove an object at that specific index
        // .removeFirst() - that's obvious
        // removeLast() - that's obvious too
        linkL.remove("N"); // removing by its value
        linkL.remove(1); // removing by its index
        linkL.removeFirst(); // removing first in the list
        linkL.removeLast(); // removing last in the list
        System.out.println("after removing: " + linkL);
    }
}
