// JavaRush lvl 10 lecture 7 problem
// reverse a string using StringBuilder
public class StringReverseJavaRush {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }
    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
