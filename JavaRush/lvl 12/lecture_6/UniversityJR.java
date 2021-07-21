// JavaRush lvl 12 lecture 6 problem
// correct program
public class UniversityJR {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() { // <--- Add static status
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        UniversityJR universityJR = new UniversityJR(); // just create a new instance
        universityJR.addStudent("Max");
        universityJR.addStudent("James");
        universityJR.printStudents();
    }
}
