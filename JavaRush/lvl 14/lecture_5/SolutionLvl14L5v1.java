// create get() method to return a String under index
// if such String is not exist -> return null

public class SolutionLvl14L5v1 {
}

class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        if (first.next == null) {
            first.next = newNode;
        }

        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node temp = last.prev;
        temp.next = newNode;
        newNode.prev = temp;
        last.prev = newNode;
    }

    public String get(int index) {
        int currentIndex = 0;
        Node currentElement = first.next;
        while ((currentElement) != null) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
