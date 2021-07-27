// JavaRush lvl 12 lecture 6 problem
// correct program
public class StudentJRLvl12L6 {
    public static void main(String[] args) {
        Student student = new Student("Jack");
        System.out.println(student.name); // <--- access to public variable
    }
}
class Student {
    public String name; // <--- have to be public

    public /* void */Student(String name) { // <--- Constructor can't be void
        this.name = name; // <--- access to this.value
    }
}
