import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MethodReference {
    public static void main(String[] args) {
        final AtomicInteger counter = new AtomicInteger(0);
        // with the method reference:
        Runnable r4 = counter::incrementAndGet;

        List<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("Java");
        stringList.add("World");

        // using lambda:
        stringList.forEach(x -> System.out.println(x));

        // using the method reference:
        stringList.forEach(System.out::println);

        // access to the methods of main class using reference:
        stringList.forEach(MethodReference::staticMethod);

        // or using an instance of the main class:
        MethodReference mR = new MethodReference();
        stringList.forEach(mR::nonStaticMethod);

        // using a reference to the method of another class:
        List<User> userList = new LinkedList<>();
        userList.add(new User("first"));
        userList.add(new User("second"));
        userList.add(new User("third"));

        userList.forEach(User::printName);
    }

    public static void staticMethod(String s) {
        // ... do something ...
    }

    public void nonStaticMethod (String s) {
        // ... do something ...

    }

    static class User {
        private String name;

        private User(String name) {
            this.name = name;
        }

        private void printName() {
            System.out.println(name);
        }
    }
}
