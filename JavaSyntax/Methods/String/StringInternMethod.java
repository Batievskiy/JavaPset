// .intern() method in Java
public class StringInternMethod {
    public static void main(String[] args) {

        // String .intern() - Set a String into a String Constant Pool (but not in heap)
        System.out.println("9. String .intern() - Set a String into a String constant pool (but not in heap) ->");

        // string allocated in Heap
        String hello1 = new String("hello");
        System.out.println("string in Heap -> " + hello1);

        // string allocated in Constant Pool
        String hello2 = new String("hello").intern();
        System.out.println("string in Pool -> " + hello2);
        System.out.print("does this two strings equal? -> ");
        System.out.println(hello1 == hello2);
        System.out.println();

        // in Heap memory
        String a = new String("Java");
        // in Heap memory
        String b = new String("World");

        // pass a value in Pool
        String r = a.intern();
        System.out.println("(Heap) a -> " + a);
        System.out.println("(Pool) r -> " + r);
        System.out.println("same address a and r ? -> " + (a == r));
    }
}