import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaceBasics {

    // Functional interface is the empty interface
    // more correct - it is the interface with the only ONE abstract method

    public static void main(String[] args) {

        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        });

        // using lambda:
        new Thread(() -> {
            System.out.println("New thread created using lambda");
        }).start();

        // more lambdas:
        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
        };

        BiConsumer<Integer, String> biConsumer = (Integer x, String y) ->
                System.out.println(x + " : " + y);
    }

}

// @FunctionalInterface annotation
// - is used to ensure that the functional interface
// can't have more than one abstract method.
@FunctionalInterface
interface Square {
    int calculate(int x);
}

class SquareTest {
    public static void main(String[] args) {
        int a = 5;

        // lambda expression to define the calculate method:
        Square square = (int x) -> x * x;

        // parameter passed and return type
        // must be same as defined in the prototype.
        int ans = square.calculate(a);
        System.out.println(ans);
    }
}

@FunctionalInterface
interface WorkerInterface {

    public void doSomeWork();

}

class WorkerInterfaceTest {

    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String[] args) {
        // calling the method doSomeWork using anonymous class
        // classic way:
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("WorkerInterface called using anonymous class");
            }
        });

        // using lambda:
        execute(() -> System.out.println("WorkerInterface called using anonymous class"));
    }
}
