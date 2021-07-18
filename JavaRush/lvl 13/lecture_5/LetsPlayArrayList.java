// JavaRush lvl 13 lecture 5

import java.util.ArrayList;

public class LetsPlayArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 20;
        // fill in with Even values from 0 to ...
        for (int i = 0; i <= size; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }

        // print out all elements
        for (Integer value : arrayList) {
            System.out.print(value);
            System.out.print(", ");
        }
        System.out.println();

        // let's delete values that divides to 4
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 4 == 0) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);

        // and let's delete last three elements
        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        System.out.println(arrayList);

    }
}
