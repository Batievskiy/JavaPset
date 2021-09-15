// in main class is static field students
// - that fills with an objects type of Student.
// class Student has name and age.
// You have to sort students by their age from younger to older
// Use Collections.sort(ArrayList<Student>, Comparator<Student>).

// create this Comparator!
// by implementing interface Comparator<Student> and
// by implementing int compare(Student student1, Student student2) in class AgeComparator
// - that returns number:
// if student1 age > student2 age - return -1;
// if student1 age < student2 age - return +1;
// if student1 age equivalent to student2 age - return 0.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SolutionLvl19L1v1 {

    public static ArrayList<Student> studentsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(studentsArrayList,
                new Student("John", 22),
                new Student("Sarah", 33),
                new Student("Terminator", Integer.MAX_VALUE));
        Collections.sort(studentsArrayList, new AgeComparator());

        for (Student student : studentsArrayList) {
            System.out.println(student);
        }
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Student : " + name +
                ", age : " + age +
                ".";
    }
}

