import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// JavaRush lvl 14 lecture 2
// Collections methods
public class CollectionsJR {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // .addAll(Collection, value1, ... , ... , ...)
        Collections.addAll(arrayList, 1, 2, 3, 4);
        System.out.println("arrayList -> " + arrayList);

        // .fill(Collection, value)
        Collections.fill(arrayList, 11);
        System.out.println("filled -> " + arrayList);
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 11);
        }

        // .nCopies(int, value)
        List<Integer> fake = Collections.nCopies(5, 100);
        ArrayList<Integer> list = new ArrayList<>(fake);
        System.out.println("copy -> " + list);

        // .replaceAll(Collection, oldValue, newValue)
        Collections.replaceAll(arrayList, 33, 100500);
        System.out.println("replaced -> " + arrayList);

        // .copy(destCollection, sourceCollection)
        ArrayList<Integer> copyList = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            copyList.add(i);
        }
        Collections.copy(copyList, arrayList);
        System.out.println("copied -> " + copyList);

        //.reverse(Collection)
        Collections.reverse(arrayList);
        System.out.println("reversed -> " + arrayList);

        // .sort(Collection)
        Collections.sort(arrayList);
        System.out.println("sorted -> " + arrayList);

        // .rotate(Collection, index)
        Collections.rotate(arrayList, 5);
        System.out.println("rotated -> " + arrayList);

        // .shuffle(Collection)
        Collections.shuffle(arrayList);
        System.out.println("shuffled -> " + arrayList);

        // .min(Collection)
        int min = Collections.min(arrayList);
        System.out.println("min -> " + min);

        // .max(Collection)
        int max = Collections.max(arrayList);
        System.out.println("max -> " + max);

        // .frequency(Collection, value)
        int frequency = Collections.frequency(arrayList, 11);
        System.out.println("frequency of 11 -> " + frequency);

        // .binarySearch(Collection, value)
        Collections.sort(arrayList);
        System.out.println("list -> " + arrayList);
        int index = Collections.binarySearch(arrayList, 100500);
        System.out.println("searched -> " + index);

        // .disjoint(Collection1, Collection2)
        boolean disjoint = Collections.disjoint(arrayList, fake);
        System.out.println(arrayList);
        System.out.println(fake);
        System.out.println(".disjoint ? -> " + disjoint);


    }
}
