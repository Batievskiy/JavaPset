// ArrayList Collection
import java.util.*;
public class ArrayListCollection {
    /*
    1. Stores elements of a specific type.
    2. Dynamically resizes the list.
    3. Adds items to the end of the list.
    4. Inserts elements at the beginning and middle of the list.
    5. Removes items from anywhere in the list.
     */

    public static void main(String[] args) {
        System.out.println("---< ArrayListCollection >---\n");
        // Creating an object ArrayList
        // zero length - zero elements
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();
        ArrayList<Double> arrayListDouble = new ArrayList<>();

        // methods:
        // 1. .add(value) - adds element at the end of the list
        System.out.println("1. .add(value) - adds element at the end of the list:");
        arrayListInteger.add(77);
        arrayListInteger.add(33);
        arrayListInteger.add(44);
        arrayListInteger.add(99);
        arrayListString.add("hello");
        arrayListString.add("java");
        arrayListString.add("world");
        arrayListString.add(":)");
        arrayListDouble.add(3.14);
        arrayListDouble.add(0.33);
        arrayListDouble.add(0.5);
        arrayListDouble.add(0.75);
        System.out.println("arrayListInteger -> " + arrayListInteger);
        System.out.println("arrayListString -> " + arrayListString);
        System.out.println("arrayListDouble -> " + arrayListDouble);
        System.out.println();

        // 2. .add(index, value) - adds element at the index position
        System.out.println("2. .add(index, value) - adds element at the index position:");
        arrayListInteger.add(3, 1001);
        arrayListString.add(2, "ADDED");
        arrayListDouble.add(1, 0.007);
        System.out.println("arrayListInteger -> " + arrayListInteger);
        System.out.println("arrayListString -> " + arrayListString);
        System.out.println("arrayListDouble -> " + arrayListDouble);
        System.out.println();System.out.println();

        // 3. .get(index) - returns element at index
        System.out.println("3. .get(index) - returns element at index:");
        int int1 = arrayListInteger.get(3);
        String string1 = arrayListString.get(2);
        double double1 = arrayListDouble.get(1);
        System.out.println("arrayListInteger.get(3) -> " + int1);
        System.out.println("arrayListString.get(2) -> " + string1);
        System.out.println("arrayListDouble.get(1) -> " + double1);
        System.out.println();

        // 4. .set(index, value) - change value at the index to a new value
        System.out.println("4. .set(index, value) - change value at the index to a new value:");
        arrayListInteger.set(0, 11);
        arrayListString.set(1, "oops");
        arrayListDouble.set(0, 0.1);
        System.out.println("arrayListInteger.set(0, 11) -> " + arrayListInteger);
        System.out.println("arrayListString.set(1, \"oops\") -> " + arrayListString);
        System.out.println("arrayListDouble.set(0, 0.1) -> " + arrayListDouble);
        System.out.println();

        // 5. .remove(index) - removes element at the index
        System.out.println("5. .remove(index) - removes element at the index:");
        arrayListInteger.remove(3);
        arrayListString.remove(2);
        arrayListDouble.remove(1);
        System.out.println("arrayListInteger.remove(3) -> " + arrayListInteger);
        System.out.println("arrayListString.remove(2) -> " + arrayListString);
        System.out.println("arrayListDouble.remove(1) -> " + arrayListDouble);
        System.out.println();

        // 6. .remove(value) - removes first value occurrence
        System.out.println("6. .remove(value) - removes first value occurrence:");
        arrayListInteger.remove(3);
        arrayListString.remove(":)");
        arrayListDouble.remove(3.14);
        System.out.println("arrayListInteger.remove(3) -> " + arrayListInteger);
        System.out.println("arrayListString.remove(\":)\") -> " + arrayListString);
        System.out.println("arrayListDouble.remove(3.14) -> " + arrayListDouble);
        System.out.println();

        // 7. .contains(value) - checks if list contains value
        System.out.println("7. .contains(value) - checks if list contains value:");
        boolean isHere = arrayListInteger.contains(7);
        boolean isThere = arrayListString.contains("world");
        boolean isContains = arrayListDouble.contains(3.14);
        System.out.println("arrayListInteger.contains(7) -> " + isHere);
        System.out.println("arrayListString.contains(\"world\") -> " + isThere);
        System.out.println("arrayListDouble.contains(3.14) -> " + isContains);
        System.out.println();

        // 8. .isEmpty() - checks the list to emptiness
        System.out.println("8. .isEmpty() - checks the list to emptiness:");
        boolean isEmpty = arrayListInteger.isEmpty();
        boolean isFull = arrayListString.isEmpty();
        boolean isWhat = arrayListDouble.isEmpty();
        System.out.println("arrayListInteger.isEmpty() -> " + isEmpty);
        System.out.println("arrayListString.isEmpty() -> " + isFull);
        System.out.println("arrayListDouble.isEmpty() -> " + isWhat);
        System.out.println();

        // 9. .size() - returns the size of the list
        System.out.println("9. .size() - returns the size of the list:");
        int arrayListIntegerSize = arrayListInteger.size();
        int arrayListStringSize = arrayListString.size();
        int arrayListDoubleSize = arrayListDouble.size();
        System.out.println("arrayListInteger.size() -> " + arrayListIntegerSize);
        System.out.println("arrayListString.size() -> " + arrayListStringSize);
        System.out.println("arrayListDouble.size() -> " + arrayListDoubleSize);
        System.out.println();

        // 10. .toArray(type[] array) - returns array of elements
        System.out.println("10. .toArray(type[] array) - returns array of elements:");
        String[] arrString = new String[arrayListStringSize];
        arrString = arrayListString.toArray(arrString);
        Integer[] arrInteger = new Integer[arrayListIntegerSize];
        arrInteger =  arrayListInteger.toArray(arrInteger);
        Double[] arrDouble = new Double[arrayListDoubleSize];
        arrDouble = arrayListDouble.toArray(arrDouble);
        System.out.println("arrayListString.toArray(arrString) -> " + Arrays.toString(arrInteger));
        System.out.println("arrayListInteger.toArray(arrInteger) -> " + Arrays.toString(arrString));
        System.out.println("arrayListDouble.toArray(arrDouble) -> " + Arrays.toString(arrDouble));
        System.out.println();

        // 11. .clear() - deletes all elements of the list
        System.out.println("11. .clear() - deletes all elements of the list:");
        arrayListInteger.clear();
        arrayListString.clear();
        arrayListDouble.clear();
        System.out.println("arrayListInteger.clear()");
        System.out.println("arrayListString.clear()");
        System.out.println("arrayListDouble.clear()");
        System.out.println("arrayListInteger.isEmpty() -> " + arrayListInteger.isEmpty());
        System.out.println("arrayListString.isEmpty() -> " + arrayListString.isEmpty());
        System.out.println("arrayListDouble.isEmpty() -> " + arrayListDouble.isEmpty());
        System.out.println();
        System.out.println();

        // this is enough for now.)
    }
}
