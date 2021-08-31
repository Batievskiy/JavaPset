// JavaRush lvl 14 lecture 4 problem
// create addStudent(name, grade) method

import java.util.HashMap;

public class SolutionJRLvl14L4 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);

    }

    public static void addStudents() {
        grades.put("name1", 5.0);
        grades.put("name2", 4.3);
        grades.put("name3", 4.9);
        grades.put("name4", 3.7);
        grades.put("name5", 4.0);
    }
}
