// JavaRush lvl 14 lecture 4

import java.util.HashMap;

public class SolutionJRLvl14L4v2 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.print("list of students -> ");
        printStudents();
        System.out.print("average mark -> " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("name1", 4.3);
        grades.put("name2", 4.9);
        grades.put("name3", 5.0);
        grades.put("name4", 3.4);
        grades.put("name5", 3.9);
    }

    public static void printStudents() {
        for (String names : grades.keySet()) {
            System.out.println(names);
        }
    }

    public static Double getAverageMark() {
        Double gradesSum = 0d;
        for (Double mark : grades.values()) {
            gradesSum = gradesSum + mark;
        }
        return gradesSum / grades.size();
    }
}
