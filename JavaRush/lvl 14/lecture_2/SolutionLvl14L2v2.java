// removeBugWithFor(ArrayList<String>) - use for loop
// removeBugWithWhile(ArrayList<String>) - use while loop
// removeBugWithCopy(ArrayList<String>) - use for-each loop
// ignore case of word "bug"

import java.util.ArrayList;
import java.util.Iterator;

public class SolutionLvl14L2v2 {
    public static String bug = "bug";
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (bug.equalsIgnoreCase(s)) {
               list.remove(s);
               i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
//        list.removeIf(s -> bug.equalsIgnoreCase(s)); <--- one line solution ;)))
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (bug.equalsIgnoreCase(s)) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String s : listCopy) {
            if (bug.equalsIgnoreCase(s)) {
                list.remove(s);
            }
        }
    }
}
