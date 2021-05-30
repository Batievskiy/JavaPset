
// let's create LinkedList from scratch
public class LinkedListNode {

    Node head; // head of the list

    // LinkedList Node - it is a static
    // so that we can call it from main() function
    static class Node {
        int key;
        Node next;

        // constructor to create a new node
        // Next is by default initialized as null
        Node(int v) {
            key = v;
            next = null;
        }
    }

    // let's create method to `insert a new node`
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

    // let's make a method to `delete a node by its Key`
    public static LinkedListNode deleteByKey(LinkedListNode list, int key) {
        // copy head node first
        Node currentNode = list.head;
        Node previousNode = null; // and creating previous node

        // if the Key is in the head node to be deleted
        if (currentNode != null && currentNode.key == key) {
            list.head = currentNode.next; // changing a head

            // print out deletion message
            System.out.println(key + " found in the `head` and deleted");

            // return the updated List
            return list;
        }

        // if the Key is not in a head node
        while (currentNode != null && currentNode.key !=key) {
            // if current node is not Key node -> check next node
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        // if the Key is found at current node
        if (currentNode != null) {
            // unlink current node from Linked List
            previousNode = currentNode.next;
            // and print out deletion message
            System.out.println(key + " found `somewhere else` and deleted");
        }

        // if the Key is not in the LinkedList at all
        if (currentNode == null) {
            // print out not found message
            System.out.println(key + " not found");
        }
        // at the end we have to return list
        return list;
    }

    // let's make a method to `delete node at a position (index)`
    public static LinkedListNode deleteAtPosition(LinkedListNode list, int index) {
        // copy head node
        Node currentNode = list.head;
        Node previousNode = null; // and creating previous node

        // if index is 0, then its the head node must be deleted
        if (index == 0 && currentNode != null) {
            list.head = currentNode.next; // changing the head

            // print out deletion message
            System.out.println(index + " found at the `head` and deleted");

            // return the updated list
            return list;
        }

        // if the index is somewhere else but not out of bounds of list length
        int counter = 0; // let's make a counter for each step through the list
        // until we find index to be deleted
        while (currentNode != null) {

            // if current node index is searched index
            if (counter == index) {

                // unlink our current node from the LinkedList
                previousNode.next = currentNode.next;

                // print out deletion message
                System.out.println(index + " found `somewhere else` and deleted");
                break; // stop searching
            } else {
                // if current index is not searched index -> keep searching
                previousNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        // if index is out of bounds if length of the LinkedList
        if (currentNode == null) {

            // print out not found message
            System.out.println(index + " is out of bounds of the List");
        }
        return list;
    }

    // let's make a method to `print the LinkedList`
    public static void printLinkedList(LinkedListNode list) {
        Node currentNode = list.head;

        System.out.print("Linked List: ");

        // traverse through the LinkedList
        while (currentNode != null) {

            // print the value of the current node
            System.out.print(currentNode.key + " ");

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
        list = insertNode(list, 22);
        list = insertNode(list, 33);
        list = insertNode(list, 66);
        list = insertNode(list, 88);
        list = insertNode(list, 7);


        printLinkedList(list);
        System.out.println(); // new line

        // and let's delete some nodes
        deleteByKey(list, 44);
        printLinkedList(list);
        System.out.println(); // new line

        // delete node with value 22 (middle one)
        deleteByKey(list, 22);
        printLinkedList(list);
        System.out.println(); // new line

        // delete value that not present in the list
        deleteByKey(list, 99);
        printLinkedList(list);
        System.out.println(); // new line

        // delete node index 0 - that is the head
        deleteAtPosition(list, 0);
        printLinkedList(list);
        System.out.println();

        // delete node that at the middle - index 3
        deleteAtPosition(list, 3);
        printLinkedList(list);
        System.out.println();

        // delete node that `out of bounds` of length if the List - index 10
        deleteAtPosition(list, 10);
        System.out.println();
    }
}
