// how to convert variable types to different types?
// let's find out
public class TypeConversion {
    public static void main(String[] args) {

        // widening or automatic type conversion
        // - assign value of a smaller data type to a bigger type
        // byte -> short -> int -> long -> float -> double
        int i = 100;
        long l = i;
        float f = l;
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println();

        // narrowing of explicit conversion
        // - assign a value of larger data type to a smaller data type
        // double -> float -> long -> int -> short -> byte
        // we have to cast (type)variable
        double db = 10987534958.817561345;
        float fl = (float) db;
        int in = (int) fl; // you will notice that this value is incorrect in terminal
        // because some bytes were cut off
        System.out.println(db);
        System.out.println(fl);
        System.out.println(in);
        System.out.println();

        byte bYte;
        int iNt = 257;
        double douBle = 323.142;

        // i%256
        System.out.println("int to byte:");
        bYte = (byte) iNt;
        System.out.println("iNt = " + iNt + " byTe = " + bYte);

        //d%256
        System.out.println("\nConversion of double to byte.");
        bYte = (byte) douBle;
        System.out.println("douBle = " + douBle + " bYte = " + bYte);

        // char to numbers conversion? why not?
        char ch = 'a';
        int num = 65;
        char ch2 = (char)num;
        System.out.println(ch); // print out 'a'
        System.out.println((int)ch); // print out 97
        System.out.println(ch2); // print out 'A'

        // type promotion in expressions are automatic to biggest data type!
        byte b1 = 77;
        char c1 = 'c';
        short s1 = 1011;
        int i1 = 70000;
        float f1 = 7.777f;
        double d1 = .314;
        // promotion are here
        double calculated = (f1 * b1) + (i1 + c1) - (d1 / s1);
        System.out.println("calculated: " + calculated);

        // that's all for now
    }
}
