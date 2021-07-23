import java.util.ArrayList;
import java.util.Iterator;

// JavaRush lvl 14 lecture 2
public class ForEachIteratorJR {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 11);
        }

        // 1. for loop
        for (int i = 0; i < arrayList.size(); i++) {
            Integer integer = arrayList.get(i);
            System.out.println(integer);
        }
        // can be replaced with Iterator
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        // and all two above can be replaced with enhanced for each loop
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        // but for each loop has downside
        // - you can't traverse and delete elements in one loop

        // so we have to use another for loop
        for (int i =0; i < arrayList.size(); i++) {
            Integer integer = arrayList.get(i);

            if (integer.equals(11)) { // <--- search for element to delete
                arrayList.remove(integer);
                i--; // <--- don't forget to go back to last i-th position, because length of the array is 1 less now
            }
        }
        // or we can use Iterator
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer.equals(22)) { // <--- search element to delete
                iterator.remove(); // <--- remove exact this element
            }
        }
        // or we can use copy of the collection:
        ArrayList<Integer> arrayListCopy = new ArrayList<>(arrayList);
        for (Integer integer : arrayListCopy) {
            if (integer.equals(33)) {
                arrayList.remove(integer);
            }
        }
        // or just use .removeIf()
        arrayList.removeIf(integer -> integer.equals(44));

        System.out.println(arrayList);
    }
}
