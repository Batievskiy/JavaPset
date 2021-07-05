// JavaRush lvl 11 lecture 7
public class GarbageJavaRush {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // this is a new life for our Cat
            Cat cat = new Cat();
            // this is the end for our Cat
            cat = null;
            // and here is the time of Garbage Collector
        }
    }
}
class Cat {
    private String name;

    public Cat() {

    }
    public Cat(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override // Garbage Collector method
    protected void finalize() throws Throwable {
        System.out.println("Cat has been deleted!");
    }
}
