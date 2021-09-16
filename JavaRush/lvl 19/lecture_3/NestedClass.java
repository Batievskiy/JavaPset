public class NestedClass {

    // Java allows to create class inside other class

    // 1:
    // An object of the inner class cannot exist
    // without an object of the outer class!

    // 2:
    // An objects of the inner class has access
    // to the variables of the outer class.

    // 3:
    // INCORRECT - Inner class object cannot be created in static method of outer class.

    // 4:
    // INCORRECT - Inner class cannot contain static variables and methods.

    // 5:
    // When creating an object of an inner class,
    // its access modifier plays an important role.
    // (public, private, package private, protected)

    // 6:
    // Access modifiers for inner classes
    // work the same as for regular variables.

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.getName();

        // To instantiate static nested class
        // we have to reference from Outer class
        OuterClass.StaticNestedClass staticNestedClass =
                new OuterClass.StaticNestedClass();
        staticNestedClass.getName();

        // To instantiate non-static nested class
        // we have to reference from outer class to method 'new'
        OuterClass.NestedClass nestedClass =
                new OuterClass().new NestedClass();
        nestedClass.getName();

        Bicycle dartmoor = new Bicycle(
                "Dartmoor Hornet",
                110,
                41);
        Bicycle.HandleBar handleBar = dartmoor.new HandleBar();
        Bicycle.Seat seat = dartmoor.new Seat();

        seat.up();
        dartmoor.start();
        handleBar.left();
        handleBar.right();
    }
}

class OuterClass {

    // some methods of outer class...
    public void getName() {

    }

    // Inner class object can be created in static method of outer class.
    public static void nestedClassInStaticMethodOfOuterClass() {
        NestedClass nC = new OuterClass().new NestedClass();
    }

    // static nested class
    static class StaticNestedClass {
        // some methods of nested class...
        public void getName() {
            System.out.println("StaticNestedClass");
        }
        public static int n = 100;
    }

    // non-static nested class also known as inner class
    class NestedClass { // may be static also
        // some methods of nested class...
        public void getName() {
            System.out.println("NestedClass - inner class");
        }

        // Inner class can contain static variables and methods.
        public static String s = "100";

        public static void outerClassInStaticMethodOfNestedClass() {
            OuterClass oC = new OuterClass();
        }

        public static void staticInnerClassInStaticMethodOfNestedClass() {
            OuterClass.StaticNestedClass sNC = new OuterClass.StaticNestedClass();
        }
    }

    // also inner class can be:
    // - local class
    // - anonymous class
}

// simple example:
class Bicycle {
    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Bicycle starts!");
    }

    public class HandleBar {

        public void right() {
            System.out.println("HandleBar to the right ->");
        }

        public void left() {
            System.out.println("HandleBar to the left <-");
        }
    }

    public class Seat {

        public void up() {
            System.out.println("Seat Up!");
        }

        public void down() {
            System.out.println("Seat down¡");
        }

        // access to outer class variable here:
        public void getSeatDiameter() {
            System.out.println("seat diameter is: " +
                    Bicycle.this.seatPostDiameter);
        }
    }
}
