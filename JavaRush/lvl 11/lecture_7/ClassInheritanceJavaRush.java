// JavaRush lvl 11 lecture 7
// Class Inheritance basics
public class ClassInheritanceJavaRush {
    public static void main(String[] args) {
        Cat cat = new Cat("newBrain", "newHeart", "newTail");
    }
}

class Animal {
    String heart = "default_heart";
    String brain = "default_brain";

    public static int animalCount = 0;

    public Animal() {
        System.out.println("DEFAULT PARENT constructor check!");
        this.heart = heart;
        this.brain = brain;
    }

    public Animal(String heart, String brain) {
        System.out.println("CUSTOM PARENT constructor check!");
        System.out.println();

        System.out.println("does default variables initialized?");
        System.out.println("current static animal count -> " + animalCount);
        System.out.println("current heart value -> " + this.heart);
        System.out.println("current brain value -> " + this.brain);
        System.out.println();

        System.out.println("does Cat Class variables initialized?");
        this.heart = heart;
        this.brain = brain;
        animalCount++;
        System.out.println("animalCount -> " + animalCount);
        System.out.println("CUSTOM PARENT constructor FINISHED!");
        System.out.println("current heart value -> " + this.heart);
        System.out.println("current brain value -> " + this.brain);
        System.out.println();

    }
}
class Cat extends Animal {
    String tail = "default_tail";
    public static int catCount = 0;
    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("CHILD constructor check!");
        System.out.println("current static catCheck value -> " + catCount);
        System.out.println("current Cat heart -> " + this.heart);
        System.out.println("current Cat brain -> " + this.brain);
        System.out.println("current Cat tail -> " + this.tail);
        this.tail = tail;
        catCount++;
        System.out.println("CUSTOM CHILD constructor FINISHED!");
        System.out.println("current Cat tail -> " + this.tail);
        System.out.println("Cat counter -> " + catCount);
        System.out.println();
    }
}
