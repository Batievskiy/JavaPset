// JavaRush problem lvl 10 lecture 6
// Compare Strings not using .equals() method
public class StringPool {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        return (first.intern() == second.intern());
    }
}
