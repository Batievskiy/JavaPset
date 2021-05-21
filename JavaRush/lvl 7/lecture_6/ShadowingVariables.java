/* what is shadowing?
 * practice of using variables in overlapping scope with the same name
 * where the variable in low-level scope overrides the variable of high-level scope
 * to access to Class variable we have to use Class.this.variable
*/
public class ShadowingVariables {

    // this is instance of a variable or member variable
    String name = "Outer Black";

    // this is nested inner class
    class innerShadow {

        // and this is another instance of a variable or member
        String name = "Inner Jack";

        // this function prints content of instance variables
        public void printVar() {
            System.out.println(name); // inner name
            System.out.println(ShadowingVariables.this.name);  // outer name
        }
    }

    public static void main(String[] args) {

        // access an inner class
        ShadowingVariables shadowOuter = new ShadowingVariables();
        ShadowingVariables.innerShadow shadowInner = shadowOuter.new innerShadow();

        // and call print function
        shadowInner.printVar();
    }

}
