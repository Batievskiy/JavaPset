// overload method print five different ways

public class SolutionLvl2L4v2 {
    public static void main(String[] args) {
        print(11);
        print((Integer) 33);
        print("Some kind of monster");
        print(true);
        print(3.14f);
    }

    public static void print(int i) {
        System.out.println("int : " + i);
    }

    public static void print(String s) {
        System.out.println("String : " + s);
    }

    public static void print(Integer integer) {
        System.out.println("Integer : " + integer);
    }

    public static void print(Boolean b) {
        System.out.println("Boolean : " + b);
    }

    public static void print(Float f) {
        System.out.println("Float : " + f);
    }
}
