// JavaRush lvl 14 lecture 1
// Collections

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;


public class JavaRushLvl14L1 {
    /*
    List            ArrayList           list
                    LinkedList          linked list
                    Vector              vector
                    Stack               stack

    Set             HashSet             set
                    TreeSet
                    LinkedHashSet

    Queue           PriorityQueue       queue
                    ArrayQueue

    Map             HashMap             map / dictionary
                    TreeMap
                    HashTable
     */
    public static void main(String[] args) {

        // create Lists
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i); // fill it using .add()
            linkedList.add(i);
            vector.add(i);
            stack.push(i); // fill it using .push();
        }
        // and so on
    }
}
