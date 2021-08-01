// JavaRush lvl 15 lecture 6

public class StackTraceElementLvl15L6v2 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Thread currentThread = Thread.currentThread();
        StackTraceElement[] methods = currentThread.getStackTrace();

        for (StackTraceElement info : methods) {
            System.out.println("getClassName() -> " + info.getClassName());
            System.out.println("getMethodName() -> " + info.getMethodName());

            // return name of the file (can be several classes in one file)
            System.out.println("getFileName() -> " + info.getFileName());
            // returns line number from file where method has been called
            System.out.println("getLineNumber() -> " + info.getLineNumber());

            System.out.println("getModuleName() -> " + info.getModuleName());
            System.out.println("getModuleVersion() -> " + info.getModuleVersion());
            System.out.println();
        }
    }
}
