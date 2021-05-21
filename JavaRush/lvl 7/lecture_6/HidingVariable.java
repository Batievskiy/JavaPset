/* what is Variable Hiding?
 * variable hiding happens when we define a variable in child class
 * with the same name as one we defined in the parent class
 * A child class can declare a variable with the same name as inherited variable
 * from its parent class, thus hiding the inherited variable
 * variable Hiding is not the same as Method overriding!
*/
public class HidingVariable {
    public static void main(String[] args) {
        ParentVariable parentVariable = new ParentVariable();
        ParentVariable childVariable = new ChildVariable();

        parentVariable.printInstanceVariable();
        childVariable.printInstanceVariable();
    }
}

class ParentVariable {
    String instanceVariable = "parent's variable";

    public void printInstanceVariable() {
        System.out.println(instanceVariable);
    }

    String childS = "child's instance variable";
}

class ChildVariable extends ParentVariable {

    // here we hiding the Parent class's vasiable `childS`
    // by defining a variable in the child class with the same name
    String instanceVariable = "child's instance variable";

    public void printInstanceVariable() {
        System.out.println(instanceVariable); // child's instance variable

        // if we still want to access the variable from the super class
        // we have to use super.childS
        System.out.println(", " + super.instanceVariable + "\n"); // parent's instance variable
    }
}
