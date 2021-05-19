// what is the Protected Access Modifier?
// this is detailed explanation for dummies in programming like me.)
public class ProtectedAccessModifier {
    /* Protected data member and method are only accessible by
     * the class of the same package and the subclasses
     * present in any package.
     * Classes cannot be declared protecter.
     * this access modifier is generally used in a parent child relationship
     */
    // for example below:
}

/* here the class Test that from another package
 * is able to call the multiplyTwoNumbers() method
 * which is declared protected.
 * because the Test class extends class Multiply
 * and the protected modifier allows the access of protected members
 * in subclasses (in any packages)
 */
package qwerty;
public class Multiply {
    protected int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }
}

package zxcvb;
        import qwerty.*;
class Test extends Multiply {
    public static void main(String[] args) {
        Test object = new Test();
        System.out.println(object.multiplyTwoNumbers(44, 77));
    }
}