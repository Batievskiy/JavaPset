// JavaRush lvl 13 lecture 7 problem
// in class Faculty correct the bug
// change printStudentNames(ArrayList) method

import java.util.ArrayList;

public class SolutionLvl13L7v1 {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Alex"));
        students.add(new Student("Bond"));

        printStudentNames(students);
    }

//    public static void printStudentNames(ArrayList students) { //<--- incorrect ArrayList declaration
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i).getName());
//        }
//    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (Student student : students) { // <--- we also can use for-each loop
            System.out.println(student.getName());
        }
    }
}

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
