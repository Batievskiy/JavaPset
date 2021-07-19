// JavaRush lvl 13 lecture 7
// do you know that all classes in Java are inherited from Object?
// let's find out that fact

import java.util.Scanner;

public class ClassesInheritedFromObject {
    public static void main(String[] args) {
        Object scanner = new Scanner(System.in); // reference to an object type Scanner
        Object string = new String("hello"); // reference to an object type String
        Object integer = /* new Integer */ (15); // reference to an object type Integer
        Object unknown = "Java"; // reference to an object type String

        /* BUT!
           In this case compiler does not know what type of object they are
           so...
           all the methods of that unknown types are unreachable to use
         */
        Object sc = new Scanner(System.in);
        Scanner console = (Scanner) sc; // <--- you have to cast on Scanner type

        // how to check type of the object?
        // ---> instanceof <---
        Object[] objects = {10, "hello", 3.14};

        for (Object object : objects) {
            if (object instanceof String) {
                String s = (String) object;
                System.out.println(s);
            }
        }
    }
}
