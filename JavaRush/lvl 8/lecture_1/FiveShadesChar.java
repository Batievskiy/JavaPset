// funny problem from JavaRush
// use chars in different ways and print `Hello char`
public class FiveShadesChar {

    public static char char1 = 101; //2
    public static char char2 = 'H'; //1
    public static char char3 = 114; //10
    public static char char4 = '\u006F';//5
    public static char char5 = 108; // 3
    public static char char6 = 'h';//8
    public static char char7 = 0x0063; //7
    public static char char8 = ' ';//6
    public static char char9 = 'l'; //4
    public static char char10 = 0x61; //9

    public static void main(String[] args) {
        System.out.print(char2);
        System.out.print(char1);
        System.out.print(char5);
        System.out.print(char9);
        System.out.print(char4);
        System.out.print(char8);
        System.out.print(char7);
        System.out.print(char6);
        System.out.print(char10);
        System.out.print(char3);
        System.out.println();
    }
}
