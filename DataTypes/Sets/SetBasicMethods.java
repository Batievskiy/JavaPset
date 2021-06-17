// what is Set and its methods in Java?
// let's find out part.2

import java.util.HashSet;
import java.util.Set;

public class SetBasicMethods {

    public static void main(String[] args) {
        System.out.println("---< Set and its methods in Java >---\n");

        // Since Set is an Interface, objects cannot be created of the typeset
        // We always need a class which extends this list in order to create an object
        // we also can restrict the type of object that can be stored in the Set
        Set<String> hashSet = new HashSet<String>();

        // Insertion order is not retained in the Set
        // Internally, for every element, a hash is generated
        // and the values are stored with respect to the generated hash.
        // The values are compared and stored in the ascending order
        // All the duplicates are ignored

        // 1. Adding Elements using .add() method
        System.out.println("1. Adding Elements using .add() method ->");
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("third");
        hashSet.add("fourth");
        hashSet.add("fifth");
        hashSet.add("sixth");
        hashSet.add("seventh");
        System.out.println("current Set -> " + hashSet + "\n");

        // 2. Accessing / check the Elements using .contains()
        String check = "first";
        System.out.println("2. .contains(\"" + check + "\") in the Set -> "
                + hashSet.contains(check));
        System.out.println();
        System.out.println("current Set -> " + hashSet + "\n");

        // 3. Removing the Values using .remove()
        hashSet.remove("second");
        System.out.println("3. .remove(\"second\") -> " + hashSet + "\n");

        // 4. Iterating through the Set using `enhanced for loop`
        System.out.println("4. Iterating through the Set\nusing `enhanced for loop` ->");
        for (String value : hashSet) {
            System.out.println(value + ", ");
        }
        System.out.println();

        // 5. Check a Hash Code of the Set using .hashCode()
        System.out.println("5. .hashCode() check -> " + hashSet.hashCode() + "\n");

        // 6. Check is Set empty using .isEmpty
        System.out.println("6. .isEmpty() check? -> " + hashSet.isEmpty() + "\n");

        // 7. Check size of the Set using .size()
        System.out.println("7. .size() of the Set -> " + hashSet.size() + "\n");

        // 8. Remove all elements from the Set using .clear()
        // but not delete the set
        hashSet.clear();
        System.out.println("8. .clear() Set ->\n");

        // instance of the Set is still here
        hashSet.add("SetMethodsOther.java");
        System.out.println("Se You in the -> " + hashSet + " <- file");
    }
}