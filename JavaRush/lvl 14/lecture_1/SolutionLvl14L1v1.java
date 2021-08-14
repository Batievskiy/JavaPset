// checkWords() - has to check existence of a word in Set

import java.util.HashSet;
import java.util.Arrays;

public class SolutionLvl14L1v1 {
    public static HashSet<String> words = new HashSet<>(Arrays.asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("word " + word + " exist in HashSet");
        } else {
            System.out.println("word " + word + " does not exist in HashSet");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
