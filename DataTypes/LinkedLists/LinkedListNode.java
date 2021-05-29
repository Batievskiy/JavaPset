
// let's create LinkedList from scratch
public class LinkedListNode {

    Node head; // head of the list

    // LinkedList Node - it is a static
    // so that we can call it from main() function
    static class Node {
        int value;
        Node next;

        // constructor to create a new node
        // Next is by default initialized as null
        Node(int v) {
            value = v;
            next = null;
        }
    }

    // let's create method to insert a new node
    public static LinkedListNode insertNode(LinkedListNode list, int value) {

        // creating a new node with given value
        Node newNode = new Node(value);
        newNode.next = null;

        // if the LinkedList is empty
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // else traverse till the last node
            // and insert the new node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // inserting the newNode at last node
            last.next = newNode;
        }

        // return the list by its head
        return list;
    }

    // let's make a method to print the LinkedList
    public static void printLinkedList(LinkedListNode list) {
        Node currentNode = list.head;

        System.out.print("Linked List: ");

        // traverse through the LinkedList
        while (currentNode != null) {

            // print the value of the current node
            System.out.print(currentNode.value + " ");

            // and go to next node
            currentNode = currentNode.next;
        }
    }

    // let's play with code here
    public static void main(String[] args) {

        // let's start with the empty list
        LinkedListNode list = new LinkedListNode();

        // and insert something in
        list = insertNode(list, 44);
        list = insertNode(list, 77);
        list = insertNode(list, 11);
        printLinkedList(list);
    }
}
