// in interface Runnable a method run()
// and two implementations in the class Car and Plane
// in main class is static ArrayList<Runnable> list
// and two public static methods:
// addToList(Runnable) that adds elements to list
// runList() - that calls run() from each list element

// Create all this methods!

import java.util.ArrayList;

public class SolutionLvl19L1v0 {

    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}

interface Runnable {
    void run();
}

class Car implements Runnable {
    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}

class Plane implements Runnable {
    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}