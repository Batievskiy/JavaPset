// Java Rush lvl 14 lecture 4 problem
// print out pairs of HashMap

import java.util.HashMap;
import java.util.Map;

public class SolutionLvl14L4v2 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("one", 4.3d);
        grades.put("two", 4.9d);
        grades.put("three", 5.0d);
        grades.put("four", 3.2d);
    }

    public static void printStudentsInfo() {
        for (Map.Entry<String, Double> pair : grades.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
