// JavaRush lvl 13 lecture 4
// let's recreate ArrayList class
public class CustomStringArrayList {

    // Ihe number of filled elements. Initial value is 0.
    private int size;
    // Capacity in the current data array, which will increase as the data is added.
    private int capacity; // Initial value is 10
    // Array of current elements. Initial capacity is 10
    String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }
    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] newElements = new String[capacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}

