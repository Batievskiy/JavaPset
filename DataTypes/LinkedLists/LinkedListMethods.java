import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

// ok. let's use some methods of Java LinkedList
public class LinkedListMethods {
    public static void main(String[] args) {

        // create linked list of animals
        LinkedList<String> animals = new LinkedList<>();

        // add animals to its list using .add() method
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Racoon");
        System.out.println("animals: " + animals);

        // in Java linked list is have previous and next addresses + variable
        // null<--[--previous, Value, next--]--><--[--previous, Value, next--]--><--[--previous, Value, next--]-->null

        // what methods in Java LinkedList we have?

        // 1. Add nodes
        // .add() - to add a node at the end of the LinkedList
        animals.add("Deer");
        // .add(index, value) - to add value to the particular index
        animals.add(1, "Wolf");
        System.out.print("after added animals: " + animals);
        System.out.println(); // new line

        // 2. Access nodes
        // .get(index) - to access a node at index location
        String str1 = animals.get(3);
        System.out.print("animal at index 3: " + str1);
        System.out.println(); // new line

        // .iterator() - to iterate over the nodes of a linked list
        // create an object of Iterator
        Iterator<String> iterate = animals.iterator();

        // traverse through all nodes in linked list and print it
        System.out.print("all animals: ");
        while(iterate.hasNext()) { // .hasNext() - returns `true` if there is a next node
            System.out.print(iterate.next()); // .next() - returns the next node
            System.out.print(", ");
        }
        System.out.println(); // next line

        // .listIterator() - to iterate over the nodes of a Linked list
        ListIterator<String> listIterate = animals.listIterator();
        System.out.print("iterator animals: ");

        // traverse from head to end
        while(listIterate.hasNext()) {
            System.out.print(listIterate.next());
            System.out.print(", ");
        }
        System.out.println(); // new line

        System.out.print("traverse backwards: ");
        // traverse from end to head (backwards)
        while(listIterate.hasPrevious()) { // .hasPrevious() - returns true if there exist previous node
            System.out.print(listIterate.previous()); // .previous() - returns the previous node
            System.out.print(", ");
        }
        System.out.println(); // new line

        // 3. Change nodes
        // .set(index) - to change node at the index of the Linked list
        animals.set(4, "Firefox"); // changed index 3 value
        System.out.println("changed animals: " + animals);

        // 4. Remove nodes
        // .remove(index) - to remove node at the index from Linked list
        String str2 = animals.remove(3);
        System.out.println("removed animal: " + str2);
        System.out.println("after removal: " + animals);

        // .contains(Value) - checks if the LinkedList contains the node
        System.out.println("contains Firefox? " + animals.contains("Firefox"));

        // .indexOf(Value) - returns the index of the first occurrence of the node
        System.out.println("first index of `Dog`: " + animals.indexOf("Dog"));

        // .lastIndexOf() - returns the index of the last occurrence of the element
        animals.add("Dog");
        System.out.println("+ new Dog: " + animals);
        System.out.println("last index of `Dog`: " + animals.lastIndexOf("Dog"));

        // .clear() - removes all the nodes from Linked List
        animals.clear();
        System.out.println("cleared list: " + animals);

        // .addFirst() - adds the specified node at the beginning of the linked list
        animals.addFirst("Cat");
        System.out.println("after .addFirst(): " + animals);

        // .addLast() - adds the specified node at the end of the linked list
        animals.addLast("Dog");
        System.out.println("after .addLast(): " + animals);

        // .getFirst() - returns the first node
        System.out.println(".getFirst(): " + animals.getFirst());

        // .getLast() - returns the last element
        System.out.println(".getLast(): " + animals.getLast());

        //
    }
}
