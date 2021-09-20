import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class LambdaSimplest {
    public static void main(String[] args) {

        // simplest:
        Integer[] integersArray = {1, 2, 3, 4, 5};
        Arrays.stream(integersArray).forEach(n -> System.out.println(n));

        new Thread(() -> System.out.println("first one!")).start();

        Thread thread1 = new Thread(() -> System.out.println("second one"));
        thread1.start();

        Runnable runnable = () -> System.out.println("third one");
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
