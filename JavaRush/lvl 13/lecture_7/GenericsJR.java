// JvaRush lvl 13 lecture 7
// what is Generics in Java?
// let's find out

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsJR {
    public static void main(String[] args) {
        // this is ability to add type parameters to types
        // - Generics mean parameterized types
        //  The idea is to allow type (Integer, String, … etc, and user-defined types)
        //  - to be a parameter to methods, classes, and interfaces.
        //  Using Generics, it is possible to create classes that work with different data types.
        // An entity such as class, interface, or method
        // that operates on a parameterized type is called a generic entity.

        // example:
        ArrayList<Integer> arrayListInteger; // created a variables
        arrayListInteger = new ArrayList<>(); // created an objects
        ArrayList<Integer>[] array; // created an array
        // in such collection is allowed to store Integers only
        arrayListInteger.add(11);
        arrayListInteger.add(33);
        // arrayListInteger.arr("hello") // <--- ERROR! does not allowed!

        // how do Generics work?
        // the compiler simply replace tye type of the parameter with it,
        // only without the parameter
        // example1:
        ArrayList<Integer> list = new ArrayList<Integer>();
        // this is what the compiler does ---> ArrayList list = new ArrayList();
        list.add(1); // compiler ---> list.add( (Integer) 1 );
        int x = list.get(0); // compiler ---> int x = (Integer) list.get(0);
        list.set(0, 10); // compiler ---> list.set(0, (Integer) 10 );
        // example2 below ⇣ in public methods

        // more types for Genetics:
        // HashMap example:
        HashMap<Integer, String> hashMapIntegerString = new HashMap<>();
        hashMapIntegerString.put(77, "hello");
        hashMapIntegerString.put(33, "Java");

        // List of Lists example:
        ArrayList<String> listHello = new ArrayList<>(); // <--- list of hello
        listHello.add("hello");
        listHello.add("hey");
        ArrayList<String> listBye = new ArrayList<>(); // <--- list of bye
        listBye.add("bye");
        listBye.add("chao");
        ArrayList<ArrayList<String>> helloByeList = new ArrayList<>(); // <--- list of lists hello and bye
        helloByeList.add(listHello);
        helloByeList.add(listBye);
    }

    // how do Generics work?
    // example2:
    public int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number; // compiler ---> (Integer) numbers.get(i);
        }
        return result;
    }
}
