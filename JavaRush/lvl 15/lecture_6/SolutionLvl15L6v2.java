// in class MyStack:
// create your own data structure using ArrayList.
// all the elements are stored in private list 'storage'.
// push() - add the element at the beginning of the list.
// pop() - returns first element of the list and deletes it from the list.
// peek() - returns first element from the list, but keeps it in the list.
// empty() - checks if the list is empty.
// search() - searches the element in the list and returns its index
// (if not return -1).

import java.util.ArrayList;
import java.util.List;

public class SolutionLvl15L6v2 {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String first = storage.get(0);
        storage.remove(0);
        return first;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        int index = 0;
        for (String string : storage)
            if (s.equals(string)) {
                return storage.indexOf(string);
            }
        return -1;
    }
}
