// JavaRush lvl 12 lecture 1
// how does Classes loads in memory?
public class ClassInMemoryLoading {
    /*
                             |    |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
                             |--> | Class info: java.lang.Class |
                             |    |_____________________________|
                             |
                             |
 |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|   |    |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
 | File <Solution.class> | --|--> | Class Solution: static variables and methods |
 |_______________________|   |    |______________________________________________|
                             |
                             |
                             |    |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
                             |--> | Code of class Solution methods (compiled) |
                             |    |___________________________________________|

        1. File Solution.class - stores at the hard drive.
        - contains all info about class, its fields and methods
        - and compiled Byte Code

        2. Class info: java.langClass - contains info about loaded class:
        - name, methods names, fields types and so on.

        3. Class Solution - stores all static variables and class methods

        4. Byte Code in Java-Machine
     */
    /*
        ---< How to get such info? >---

        Class<s> s = String.class;
        Class<o> o = Object.class;
        Class<i> i = Integer.class;
        ...
        Class<v> v = void.class;

        ---< How to get a reference? >---
        Class<a> s = "Hello".getClass();
        Class<b> i = Integer.class;
        ...
        Class<b> b = Boolean.TRUE.getClass();
     */

    public static void main(String[] args) {
        Class<String> las = String.class;
        Class<Void> main = void.class;
        Class<Object> obj = Object.class;

        Class<? extends String> a = "hello".getClass();
        Class<Integer> i = Integer.class;
        Class<? extends Boolean> c = Boolean.TRUE.getClass();
    }
}
