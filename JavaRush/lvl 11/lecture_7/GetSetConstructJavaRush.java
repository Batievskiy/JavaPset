// JavaRush lvl 11 lecture 7
// getters, setters and Constructors reminder
public class GetSetConstructJavaRush {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("James");
        student.setAge(18);
        System.out.println("new student:");
        student.printData();
        System.out.println();

        Student unknown = new Student();
        System.out.println("student without data:");
        unknown.printData();
    }
}

class Student {
    private String name;
    private int age;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else this.age = -1;
    }

    // print data method
    public void printData() {
        if (this.age == -1) {
            System.out.println("name: " + this.name + "\nage: " + "UNKNOWN");
        } else {
            System.out.println("name: " + this.name + "\nage: " + this.age);
        }
    }

    // Constructor Default
    Student() {
        this.name = "UNKNOWN";
        this.age = -1;
    }

    // Constructor with two variables
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
