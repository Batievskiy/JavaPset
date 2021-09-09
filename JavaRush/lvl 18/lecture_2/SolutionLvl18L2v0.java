// override move() method for class Bat to print "I'm flying"

public class SolutionLvl18L2v0 {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.move();
    }
}

// inheritance from class Animal
class Bat extends Animal {
    public void move() {
        System.out.println("I'm flying!");
    }
}

class Animal {
    public void move() {
        System.out.println("I'm running!");
    }
}