import java.util.Date;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedVsArrayListsLvl14L8 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            linkedList.add(i);
        }
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            linkedList.add(2_000_000, Integer.MAX_VALUE);
        }
        System.out.println("linkedList time -> " + (System.currentTimeMillis() - start1));

        // here is the arrayList is faster because:
        // for arrayList index 2_000_000 is exist and has O(n)
        // and for linkedList index 2_000_000 is not exist
        // - > its 2billions away from the first node(head->next->next->...tail)
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            arrayList.add(i);
        }
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            arrayList.add(2_000_000, Integer.MAX_VALUE);
        }
        System.out.println("arrayList time -> " + (System.currentTimeMillis() - start2));

        // another example:

        System.out.print("linkedList ");
        getTimeOfInsert(new LinkedList<>());
        System.out.print("arrayList ");
        getTimeOfInsert(new ArrayList<>());

    }

    private static long getTimeOfInsert(List<Object> list) {
        Date currentTime = new Date();
        insert(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("delay -> " + msDelay);
        return msDelay;

    }

    private static void insert(List<Object> list) {
        for (int i = 0; i < 1_000_00; i++) {
            list.add(0, new Object());
        }
    }

}
