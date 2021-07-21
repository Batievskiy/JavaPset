// JavaRush lvl 12 lecture 6 problem
// correct the program to exclude student

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniversityGroupJR {
    public List<String> students;

    public UniversityGroupJR() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    // correct this:
//    public void exclude(String excludedStudent) {
//        for (String student : students) {
//            if (student.equals(excludedStudent)) {
//                students.remove(student);
//            }
//        }
//    }

    // way 1:
//    public void exclude(String excludedStudent) {
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).equals(excludedStudent)) {
//                students.remove(i);
//            }
//        }
//    }

    // way 2:
//    public void exclude(String excludedStudent) {
//        Iterator<String> iterator = students.iterator();
//        while(iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals(excludedStudent)) {
//                iterator.remove();
//            }
//        }
//    }

    // way 3:
    public void exclude(String excludedStudent) {
        students.removeIf(next -> next.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroupJR universityGroupJR = new UniversityGroupJR();
        universityGroupJR.exclude("Виталий Правдивый");
        universityGroupJR.students.forEach(System.out::println);
    }
}
