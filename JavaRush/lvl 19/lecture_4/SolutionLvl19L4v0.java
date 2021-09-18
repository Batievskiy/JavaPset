// class Language is a model of programming language
// it has two fields:
// - name of the language
// - ranking of usage
// We have to create sortByRanking(ArrayList<Language>) method
// - to sort the languages from highest to lowest
// - and returns sorted Stream<Language>

// Hint:
// - use compare(Double, Double) method of the class Double
// - or compareTo(Double) of the object type Double.

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SolutionLvl19L4v0 {
    public static void main(String[] args) {
        ArrayList<Language> languageArrayList = new ArrayList<>();
        Collections.addAll(languageArrayList,
                new Language("C#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49)
        );

        Stream<Language> languageStream = sortByRanking(languageArrayList);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languageArrayList) {
        return languageArrayList.stream()
                .sorted((d1, d2) -> Double.compare(d2.getRanking(), d1.getRanking()));
    }
}

class Language {
    private String name;
    private Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Programming language -> " + name + " - " +
                ranking + "% of respondents.";
    }
}