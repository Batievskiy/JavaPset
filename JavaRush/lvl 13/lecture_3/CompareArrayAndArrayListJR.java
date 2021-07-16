// whats the difference between Array and ArrayList?
// let's find out
// JavaRush lvl 13 lecture 3

import java.util.*;

public class CompareArrayAndArrayListJR {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Create:
        String[] arrayString = new String[3]; // the Array
        ArrayList<String> arrayListString = new ArrayList<>(); // the ArrayList

        // Set element by it's index:
        arrayString[0] = "hello";
        arrayListString.set(0, "hello");

        // Get element by it's index:
        String sArr = arrayString[0];
        String sArrList = arrayListString.get(0);

        // Get length:
        int lengthArrayString = arrayString.length;
        int lengthArrayListString = arrayListString.size();

        // User input from keyboard:
        for (int i = 0; i < lengthArrayString; i++) {
            String string = sc.nextLine();
            arrayString[i] = string;
        }
        for (int i = 0; i < lengthArrayListString; i++) {
            String string = sc.nextLine();
            arrayListString.add(string);
        }

        // print out values:
        for (int i = 0; i < lengthArrayString; i++) {
            int j = lengthArrayString - i - 1;
            System.out.println(arrayString[j]);
        }
        for (int i = 0; i < lengthArrayListString; i++) {
            int j = lengthArrayListString - i - 1;
            System.out.println(arrayListString.get(j));
        }
    }

}
