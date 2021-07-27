// JavaRush lvl 12 lecture 5 problem
// correct the program
public class SolutionLvl12L5 { // <--- must be public, anf first letter UpperCase
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
/* public */ class Cat { // <--- can not de public
    String name = "Tom";
}
