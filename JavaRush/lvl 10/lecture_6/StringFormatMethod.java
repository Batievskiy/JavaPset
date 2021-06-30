// what is .format() method in Java?
// let's find out
public class StringFormatMethod {
    public static void main(String[] args) {
        System.out.println("---< .format() method in Java >---\n");

        // There are two type of string format() method:
        // - returns a formatted string using the given locale, specified format string and arguments.
        // 1. .format(Locale loc, String form, Object… args)
        // 2. .format(String form, Object… args)
        // loc– locale value to be applied on the format() method
        // form– format of the output string
        // args– It specifies the number of arguments for the format string.It may be zero or more.

        String name = "Java";
        int salary = 777;
        String pos = "Junior";
        String buc = "$";

        String formatted = String.format("%s %s Developer gains %s%d per month", pos, name, buc, salary);
        System.out.println(formatted);
        System.out.println();

        int age = 35;
        String nm = "John";
        int height = 185;
        int weight = 83;
        String data = String.format("Age = %d, Name = %s, height = %d, weight = %d", age, nm, height, weight);
        System.out.println(data);
        System.out.println();
        /* parameters:
            %s - String
            %d - byte, short, int, long
            %f - float
            %b - boolean
            %c - char
            %% - symbol %
         */
    }
}