// JavaRush lvl 14 lecture 8
// class Collections -> ArrayList

import java.util.*;

public class JRLvl14Lecture8 {
    public static void main(String[] args) {
        String mercury = new String("mercury");
        String venus = new String("venus");
        String earth = new String("earth");
        String mars = new String("mars");
        String jupiter = new String("jupiter");
        String saturn = new String("saturn");
        String uranus = new String("uranus");
        String neptune = new String("neptune");

        String mecrury2 = "mercury";

        boolean isEqual = mercury.equals(mecrury2); // <--- compare by its reference
        boolean isIIEqual = mercury == mecrury2; // <--- compare by its value
        System.out.println("isEqual -> " + isEqual);
        System.out.println("isIIEqual -> " + isIIEqual);
        System.out.println();

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(
                mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)
        );
        System.out.println("original -> " + solarSystem);
        System.out.println();

        // lets sort it
        Collections.sort(solarSystem);
        System.out.println("sorted -> " + solarSystem);
        System.out.println();

        // let's check .min() and .max()
        String minString = Collections.min(solarSystem, Comparator.comparing(String::length));
        String maxString = Collections.max(solarSystem, Comparator.comparing(String::length));
        System.out.println("min -> " + minString + ", max -> " + maxString);
        System.out.println();

        // let's reverse the list
        Collections.reverse(solarSystem);
        System.out.println("reversed -> " + solarSystem);
        System.out.println();

        // and shuffle it
        Collections.shuffle(solarSystem);
        System.out.println("shuffled -> " + solarSystem);
        System.out.println();

        // another example:
        ArrayList<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println("ten first numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(lottery.get(i));
            if (i >= 9) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();

        // INTERESTING method - .unmodifiableList()
        List<String> solarSystem2 = Collections.unmodifiableList(
                new ArrayList<>(Arrays.asList(
                        mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)
                )
        );
        // we can't add elements into such unmodifiableList
        // solarSystem2.add("new"); // <--- UnsupportedOperationException
    }

}
