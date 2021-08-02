// JavaRush lvl 13 lecture 5 problem
// find and delete Pascal from programmingLanguages

import java.util.Arrays;
import java.util.ArrayList;

public class SolutionLvl13L5v2 {
    public static ArrayList<String> programmingLanguages =
            new ArrayList<>(
                    Arrays.asList("C", "C++", "Python", "Ruby", "Java", "Pascal")
            );
    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
    }

}
