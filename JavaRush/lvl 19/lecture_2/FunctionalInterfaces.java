import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class FunctionalInterfaces {
    // A functional interface is an interface that contains only one abstract method
    // and use lambda expression for calling it

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Hello", ", ", "Java", " ", "World");

        // using lambda expression:
        System.out.print("forEach(string -> System.out.println(string)) -> ");
        arrayList.forEach(string -> System.out.print(string));
        System.out.println();

        // using functional interface Consumer<T>
        // this code is compiled like this:
        arrayList.forEach(new Consumer<String>() {
           public void accept(String s) {
               System.out.print(s);
           }
        });
        System.out.println();

        //using method reference:
        System.out.print("forEach(System.out::println) -> ");
        arrayList.forEach(System.out::print);
        System.out.println();
    }
}
