public class ChessMainJavaRush {
    public static void main(String[] args) {
        ChildClass object = new ChildClass();
    }

    public static String print(String text) {
        System.out.println(text);
        return text;
    }
}

class ParentClass {
    public String a = ChessMainJavaRush.print("ParentClass.a");
    public String b = ChessMainJavaRush.print("ParentClass.b");

    public ParentClass() {
        ChessMainJavaRush.print("ParentClass.constructor");
    }
}

class ChildClass extends ParentClass {
    public String c = ChessMainJavaRush.print("ChildClass.c");
    public String d = ChessMainJavaRush.print("ChildClass.d");

    public ChildClass() {
        ChessMainJavaRush.print("ChildClass.constructor");
    }
}