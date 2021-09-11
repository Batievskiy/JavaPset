public class InterfacesClasses {
    public static void main(String[] args) {
        Student student = new Student("John");
        System.out.println(student.getName());

        StudentI studentI = new StudentImpl("Ali");
        System.out.println(studentI.getName());
    }
}

// class for all
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}

// for private use
interface StudentI {
    public String getName();
}

class StudentImpl implements StudentI {
    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

}