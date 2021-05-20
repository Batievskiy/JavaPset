// what is a the local variables?
public class LocalVariables {

    public static class Storage {
        public static int sum = 0; // this is `class` variable and its available in terms of this class
        public static int count = 0; // same variable is here    }
    }

    // static methods can use static variables only!

    public static void add(int data) { // `data` variable is available only in this method
        Storage.sum = Storage.sum + data;
        Storage.count++;
    }

    public static void remove(int data) {
        Storage.sum = Storage.sum - data;
        Storage.count--;
    }

    public static void main(String[] args) {

        // !!! you can not declare variables with the same names inside one method
        // It only works if blocks of code, where variables declared are not crossed

        // for example:
        int a = 5; // `a` variable exist till the end of `main` method

        if (a < 10) {
            int b = 10; // `b` is local for this particular `if` statement
            System.out.println(b);
        }

        if (a < 10) {

            int b = 10; // this variable exist till the end of `if` statement

            int count = 0; // `count` variable exist till the end of `if` statement

            while (count < b - a) {
                int x = a + b; // `x` variable only exist in `while` loop
                System.out.println(x);
                count++;
            }
            System.out.println(b);
        }

        add(44);
        remove(11);
        System.out.println(Storage.sum);
    }
}
