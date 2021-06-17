// what is Set Interface in Java?
// let's find out part.1

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetInterface {

    public static void main(String[] args) {
        System.out.println("---< Set Interface in Java >---\n");

        // Since Set is an Interface, objects cannot be created of the typeset
        // We always need a class which extends this list in order to create an object
        // we also can restrict the type of object that can be stored in the Set
        Set<Integer> intSet1 = new HashSet<Integer>();

        // fill it with arrays using .addAll
        intSet1.addAll(Arrays.asList(
                new Integer[]{1, 2, 4, 6, 7, 8, 9, 0}));
        System.out.println("Set1 ---> " + intSet1);
        Set<Integer> intSet2 = new HashSet<Integer>();
        intSet2.addAll(Arrays.asList(
                new Integer[]{1, 3, 5, 7, 9,}));
        System.out.println("Set2 ---> " + intSet2);
        System.out.println();

        // let's find Union
        Set<Integer> union = new HashSet<Integer>(intSet1);
        union.addAll(intSet2);
        System.out.println("2. find Union of the two Sets:");
        System.out.println(union);
        System.out.println();

        System.out.println("Set1 ---> " + intSet1);
        System.out.println("Set2 ---> " + intSet2);
        System.out.println();

        // let's find intersection
        Set<Integer> intersection = new HashSet<Integer>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("3. find Intersection of the two Sets:");
        System.out.println(intersection);
        System.out.println();

        System.out.println("Set1 ---> " + intSet1);
        System.out.println("Set2 ---> " + intSet2);
        System.out.println();

        // let's find the symmetric Difference
        Set<Integer> difference = new HashSet<Integer>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("4. find Difference of the two Sets:");
        System.out.println(difference);
        System.out.println();
    }
}
