// JavaRush lvl 10 lecture 6
// make String output like this:
// My name is <name>. I'm gonna get $<salary> per month
public class FormatStringJavaRush {
    public static void main(String[] args) {
        System.out.println(format("James", 5000));
    }
    public static String format(String name, int salary) {
        String phrase = String.format("My name is %s. I'm gonna det $%d salary per month", name, salary);
        return phrase;
    }
}
