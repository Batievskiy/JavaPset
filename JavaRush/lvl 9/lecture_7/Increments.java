// primitive JavaRush problem
// change main() for print 20
// you can only change pre increments to post increments and backwards
public class Increments {

    /* Source code to change:

    public static void main(String[] args) {
        int a = 3;
        int b = a++ + (--a * a++);

        System.out.println(b);
    }
     */
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}