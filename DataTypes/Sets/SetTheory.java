import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SetTheory {
    private static Set<Integer> setA = setOf(1, 2, 3, 4);
    private static Set<Integer> setB = setOf(2, 4, 5, 6);

    public static void main(String[] args) {
        System.out.println("setA -> " + setA);
        System.out.println("setB -> " + setB);

        Set<Integer> intersectSet = intersection(setA, setB);
        System.out.println("intersection -> " + intersectSet);

        Set<Integer> unionSet = union(setA, setB);
        System.out.println("union -> " + unionSet);

        Set<Integer> differABSet = difference(setA, setB);
        System.out.println("differenceAB -> " + differABSet);
        Set<Integer> differBASet = difference(setB, setA);
        System.out.println("differenceBA -> " + differBASet);

        Set<Integer> symDifferSet = symDifference(setA, setB);
        System.out.println("symDifference -> " + symDifferSet);
    }

    public static Set<Integer> intersection(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> intersectSet = new HashSet<>(setA);
        intersectSet.retainAll(setB);
        return intersectSet;
    }

    public static Set<Integer> union(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        return unionSet;
    }

    public static Set<Integer> difference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> differenceSet = new HashSet<>(setA);

        // .removeAll() - removes all elements from setA that also exist in setB
        differenceSet.removeAll(setB);
        return differenceSet;
    }

    public static Set<Integer> symDifference(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> unionAB = new HashSet<>(setA);
        unionAB.addAll(setB);
        Set<Integer> intersectionAB = new HashSet<>(setA);
        intersectionAB.retainAll(setB);
        Set<Integer> symDifference = new HashSet<>(unionAB);
        symDifference.removeAll(intersectionAB);
        return symDifference;
    }

    private static Set<Integer> setOf(Integer... values) {
        return new HashSet<Integer>(Arrays.asList(values));
    }
}
