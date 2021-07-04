// JavaRush lvl 11 lecture 7
// passing parameters to methods
public class TimeMachineJavaRush {

    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2020;

        System.out.println("---> let's pass a primitive to method <---");
        System.out.println("What year is it? -> " + currentYear);

        System.out.println("after goToPast? -> " + currentYear);
        System.out.println("Why is that?");
        System.out.println("because all the parameters are going to methods ->\n" +
                "as copies of passed values");
        System.out.println("Its called passing parameters by its value");
        System.out.println();

        System.out.println("---> let's pass an Object to method <---");
        // let's try to pass Cat to future and back
        Cat cat = new Cat("Bucks", 5); // new Cat age 5 years in Present Time
        System.out.println("age of Cat -> " + cat.age);

        // passing Cat to future
        System.out.println("passing Cat to future");
        timeMachine.goToFuture(cat);
        System.out.println("age of Cat -> " + cat.age);
        System.out.println("no way it's worked!!!");
        System.out.println("because Objects in Java passes it's reference copy");
    }
}

class TimeMachine {
    public void goToFuture(int currentYear) {
        System.out.println("goTuFuture start");
        System.out.println("currentYear (start) -> " + currentYear);
        currentYear = currentYear + 10;
        System.out.println("currentYear (end) -> " + currentYear);
        System.out.println("goToFuture end");
    }

    public void goToPast(int currentYear) {
        System.out.println("goToPast start");
        System.out.println("currentYear (end) -> " + currentYear);
        currentYear = currentYear - 10;
        System.out.println("currentYear (end) -> " + currentYear);
        System.out.println("goToPast end");
    }

    public void goToFuture(Cat cat) {
        cat.age += 10;
    }

    public void goToPast(Cat cat) {
        cat.age -= 10;
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}