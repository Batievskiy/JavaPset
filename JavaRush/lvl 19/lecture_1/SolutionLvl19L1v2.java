// in main class is static field mentors that fills with objects of JavaRush class
// class JavaRushMentor has name
// we need to sort mentors by its name length from shorter to longer
// to sort mentors use a method Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>)

// Create this comparator
// in class NameComparator you have to implement interface Comparator<JavaRushMentor>
// ant implement method int compare(JavaRushMentor mentor1, JavaRushMentor2)
// that returns a number:
// - if mentor1 name length < mentor2 name length - return -1
// - if mentor1 name length > mentor2 name length - return +1
// - if mentor1 name equivalent to mentor2 name - return 0

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;

public class SolutionLvl19L1v2 {
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("John"),
                new JavaRushMentor("Rash"),
                new JavaRushMentor("Eleonora"),
                new JavaRushMentor("Hans"),
                new JavaRushMentor("Kim"),
                new JavaRushMentor("Julio"),
                new JavaRushMentor("Diego"),
                new JavaRushMentor("Lana")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}

class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mentor's name : " + name;
    }
}

class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor m1, JavaRushMentor m2) {
        return m1.getName().length() - m2.getName().length();
    }
}