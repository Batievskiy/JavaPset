// JavaRush lvl 14 lecture 4 problem
// change getProgrammingLanguages using HashMap instead ArrayList

import java.util.ArrayList;
import java.util.HashMap;

public class SolutionLvl14L4v3 {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

//    public static ArrayList<String> getProgrammingLanguages() {
//        ArrayList<String> programmingLanguages = new ArrayList<>();
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Kotlin");
//        programmingLanguages.add("Go");
//        programmingLanguages.add("Javascript");
//        programmingLanguages.add("Typescript");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("PHP");
//        programmingLanguages.add("C++");
//        return programmingLanguages;
//    }

    // changed
    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> pLng = new HashMap<>();
        pLng.put(0, "Java");
        pLng.put(1, "Kotlin");
        pLng.put(2, "Go");
        pLng.put(3, "Javascript");
        pLng.put(4, "Typescript");
        pLng.put(5, "Python");
        pLng.put(6, "PHP");
        pLng.put(7, "C++");
        return pLng;
    }
}
