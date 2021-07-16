// whats the difference between Array and ArrayList?
// let's find out

import java.util.*;

public class CompareArrayAndArrayList {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---< Difference between Array and ArrayList >---\n");
        // Create:
        String[] arrayString = new String[4]; // the Array
        ArrayList<String> arrayListString = new ArrayList<>(); // the ArrayList

        System.out.println("arrayString -> " + Arrays.toString(arrayString));
        System.out.println("arrayListString -> " + arrayListString);
        System.out.println();

        // Add elements by it's index:
        System.out.println("Add elements by it's index:");
        arrayString[0] = "This is";
        arrayString[1] = "is";
        arrayString[2] = "the";
        arrayString[3] = "Array";
        arrayListString.add(0, "This");
        arrayListString.add(1, "is");
        arrayListString.add(2, "the");
        arrayListString.add(3, "error");
        arrayListString.set(2, "ArrayList"); // <- use .set() to change value at the index
        System.out.println("arrayString -> " + Arrays.toString(arrayString));
        System.out.println("arrayListString -> " + arrayListString);
        System.out.println();

        // Get element by it's index:
        String sArr = arrayString[0];
        String sArrList = arrayListString.get(1);
        System.out.println("arrayString[0] -> " + sArr);
        System.out.println("arrayListString.get(1) -> " + sArrList);
        System.out.println();

        // Get length:
        int lengthArrayString = arrayString.length;
        int lengthArrayListString = arrayListString.size();
        System.out.println("arrayString.length -> " + lengthArrayString);
        System.out.println("arrayListString.size() -> " + lengthArrayListString);
        System.out.println();

        // User input from keyboard:
        for (int i = 0; i < lengthArrayString; i++) {
            System.out.printf("type a word %s -> ", i);
            String string = sc.nextLine();
            arrayString[i] = string;
        }
        for (int i = 0; i < lengthArrayListString; i++) {
            System.out.printf("type a word %s -> ", i);
            String string = sc.nextLine();
            arrayListString.add(string);
        }
        System.out.println();

        // print out values:
        System.out.println("print out values of the arrayString:");
        for (int i = 0, len = arrayString.length; i < len; i++) {
            int index = len - i - 1;
            System.out.println(arrayString[index]);
        }
        System.out.println();

        System.out.println("print out values of the arrayListString:");
        for (int i = 0, len = arrayListString.size(); i < len; i++) {
            int index = len - i - 1;
            System.out.println(arrayListString.get(index));
        }
    }

}
