// JavaRush lvl 11 lecture 2
// how to initialize variables?
public class VarInitializeJavaRush {
    public static void main(String[] args) {
        Cat cat = new Cat("Bucks", 14); // first constructor used
        Cat cat1 = new Cat(); // second constructor used
    }
}

class Cat {
    public String name;
    public int age = -1; // variable age initialization

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this.name = "UNKNOWN";
    }
}
