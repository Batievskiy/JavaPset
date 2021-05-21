/* what is a the local variables?
 * a variables defined withing a block of method of coustructor
 * local variables are created when the block is entered or the function is called and destroyed
 * The scope of local variables exists only within the block in which the variable is declared
 * Initialization of local variable is mandatory!
*/
public class LocalVariables {

    public void PeopleAge() {
        // age is local variable tor this block specific
        int age = 0;
        age = age + 5;
        System.out.println("people age is: " + age);
    }

    public static void main(String[] args) {

        // !!! you can not declare variables with the same names inside one method
        // It only works if blocks of code, where variables declared are not crossed

        // for example:
        int a = 5; // `a` variable exist till the end of `main` method

        if (a < 10) {
            int b = 10; // `b` is local for this particular `if` statement
            System.out.println(b);
        }

        if (a < 10) {

            int b = 10; // this variable exist till the end of `if` statement

            int count = 0; // `count` variable exist till the end of `if` statement

            while (count < b - a) {
                int x = a + b; // `x` variable only exist in `while` loop
                System.out.println(x);
                count++;
            }
            System.out.println(b);
        }
    }
}
