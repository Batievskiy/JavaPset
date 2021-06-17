// what is Set and its methods in Java?
// let's find out part.3

import java.util.*;

public class SetMethodsOther {
    public static void main(String[] args) {
        System.out.println("---< Set and its methods in Java >---\n");

        // Since Set is an Interface, objects cannot be created of the typeset
        // We always need a class which extends this list in order to create an object
        // we also can restrict the type of object that can be stored in the Set
        Set<String> hashSet = new HashSet<>();

        // Insertion order is not retained in the Set
        // Internally, for every element, a hash is generated
        // and the values are stored with respect to the generated hash.
        // The values are compared and stored in the ascending order
        // All the duplicates are ignored

        // Adding Elements using .add() method
        System.out.println("Adding Elements using .add() method ->");
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.add("six");
        hashSet.add("seven");
        System.out.println("current Set -> " + hashSet + "\n");

        // 1. .iterator() - return an iterator of the same elements as the Set
        Iterator itsValue = hashSet.iterator();

        // print out Iterator
        System.out.println("1. The Iterator values are ->");
        while (itsValue.hasNext()) {
            System.out.println(itsValue.next());
        }
        System.out.println();


        // 2. .toArray() - form an Array of the same elements as that of the Set
        Object[] array = hashSet.toArray();
        System.out.println("2. .toArray() - Copy Set to an Array ->");
        System.out.println("current Set -> " + hashSet);
        System.out.println("current Array -> " + Arrays.toString(array) + "\n");

        // 3. .containsAll - check whether two Sets contain the same elements or not
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("three");

        Set<String> set2 = new HashSet<>();
        set2.add("four");
        set2.add("five");
        set2.add("six");

        System.out.println("3. Does set1.containsAll(set2) ? -> " + set1.containsAll(set2));
        System.out.println("set1 -> " + set1);
        System.out.println("set2 -> " + set2 + "\n");

        // 4. .addAll - append all of the elements
        // from the mentioned collection to the existing Set
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(set1);
        System.out.println("4. Add all elements from set1 to a treeSet.addAll(set1)\ntreeSet -> "
                + treeSet +"\n");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(set2);
        System.out.println("4. Add all elements from set2 to a arrayList.addAll(set1)\narrayList -> "
                + arrayList +"\n");

        // 5. .retainAll() - retain from this Set all or its elements
        // tht are contained in the Specified collection
        System.out.println("current hashSet -> " + hashSet);
        System.out.println("current set1 -> " + set1);
        hashSet.retainAll(set1);
        System.out.println("5. hashSet after retain elements present in set1 -> " + hashSet + "\n");

        // 6. .removeAll - remove from this Set all of its elements
        // that are contained in the specific collection
        System.out.println("current hashSet -> " + arrayList);
        System.out.println("current set2 -> " + set2);
        hashSet.retainAll(set2);
        System.out.println("6. hashSet after removed elements that present in set2 -> " + hashSet);

    }
}
