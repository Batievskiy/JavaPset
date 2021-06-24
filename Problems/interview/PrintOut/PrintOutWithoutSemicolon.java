// Tricky Interview questions example:
// Print out Hello World without using semicolon ( ; )
public class PrintOutWithoutSemicolon {
    public static void main(String[] args) {

        // first way
        if (System.out.printf("Hello world") == null) {

        }

        // second way
        if (System.out.append("Hello world") == null) {

        }
    }
}