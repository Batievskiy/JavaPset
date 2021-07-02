// JavaRush lvl 11 lecture 2
// how to create constructors?
public class ConstructorJavaRush {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        Cat catWithNameAge = new Cat("bucks", 22);
        Cat catWithName = new Cat("Sam");
        Cat catUnknown = new Cat();
    }
}

class Point {
    public int x;
    public int y;

    // basic constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Cat {
    private static final int UNKNOWN = 0;
    public String name;
    public int age;

    // constructor with name and age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // constructor wit name only
    public Cat(String name) {
        this.name = name;
        this.age = UNKNOWN;
    }

    // Default constructor unknown
    public Cat() {
        this.name = "UNKNOWN";
        this.age = UNKNOWN;
    }
}
