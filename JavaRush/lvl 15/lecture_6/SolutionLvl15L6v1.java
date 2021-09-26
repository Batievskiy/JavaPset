// print out info about each stack trace element in such way:
// "Method<name> has called from line <number> of the class <name> in the file <name>"

public class SolutionLvl15L6v1 {

    public static final String OUTPUT_FORMAT =
            "Method %s has called from line %d of the class %s in the file %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTraceElements) {
        for (var element : stackTraceElements) {
            System.out.printf(OUTPUT_FORMAT,
                    element.getMethodName(),
                    element.getLineNumber(),
                    element.getClassName(),
                    element.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
