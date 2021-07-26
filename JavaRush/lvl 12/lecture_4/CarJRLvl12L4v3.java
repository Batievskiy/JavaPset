public class CarJRLvl12L4v3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner class creation");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Nested class creation");
        }
    }
}
