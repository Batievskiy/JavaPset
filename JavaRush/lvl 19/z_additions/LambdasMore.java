import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LambdasMore {
    public static void main(String[] args) {

        int counter1 = 0;
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // counter1++; // can't change this value
                // - because it has to be final and not changeable

                // The same principle used with Lambda expressions
                // - they only can see visible objects but not change them.
            }
        };
        // with lambda:
        // Runnable r1 = () -> counter1++;

        // but we actually can change it
        final AtomicInteger counter2 = new AtomicInteger(0);
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                counter2.incrementAndGet();
            }
        };

        // with lambda:
        Runnable r3 = () -> counter2.incrementAndGet();

        // with method reference
        Runnable r4 = counter2::incrementAndGet;


        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
        };

        BiConsumer<Integer, String> biConsumer = (Integer x, String y) ->
                System.out.println(x + " : " + y);
    }
}
