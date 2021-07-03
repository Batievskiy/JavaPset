// JavaRush lvl 11 lecture 7
public class CatsJavaRush {

    public static void main(String[] args) {

        Cat bars = new Cat();
        bars.name = "Bars"; //
        bars.age = 2;
        System.out.println("primitive Cat -> " + bars.name +
                ", age -> " + bars.age);
        bars.meow();
        Cat.count++;

        Cat bucks = new Cat();
        bucks.name = "Bucks";
        bucks.age = 4;
        System.out.println("primitive Cat -> " + bucks.name +
                ", age -> " + bucks.age);
        bucks.jump();
        Cat.count++;

        System.out.println("total Cats -> " + Cat.count);
    }
}

// primitive Class
// without getters, setters and Constructors
class Cat {
    String name;
    int age;
    static int count = 0;

    public void meow() {
        System.out.println("meow");
    }
    public void jump() {
        System.out.println("jumps");
    }
}