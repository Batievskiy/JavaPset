// What is the Escape Sequences in Java?
// let's find out
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("---< Escape Sequences in Java >---");

        // A character with a backslash \ just before it
        // - is an escape sequence or escape character

        // \t - insert a tab
        System.out.println("\\t - insert a tab -> \t <-");

        // \b - insert a backspace
        System.out.println("\\b - insert a backspace -> ..!\b <-");

        // \n - insert a newline
        System.out.println("\\n - insert a ->\nnew line <-");

        // \f - form feed
        System.out.println("\\f - form feed -> \f <-");

        // \r - inserts a carriage return at the point where it is being used
        System.out.println(".... \\r - a carriage return ->..\r..<-");

        // \' - insert a single quote '
        System.out.println("\\' - insert a single quote -> \' <-");

        // \" - insert a double quote "
        System.out.println("\\\" - insert a double quote -> \" <- ");

        // \\ - insert a backslash \
        System.out.println("\\\\ - insert a backslash -> \\ <-");

        String formFeedExample = "This is just an example \f We got into a new line ";
    }
}
