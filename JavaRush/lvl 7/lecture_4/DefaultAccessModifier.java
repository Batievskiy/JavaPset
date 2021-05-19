// what is Default access modifier?
// this is detailed explanation fod Dummies in programing like me.)
public class DefaultAccessModifier {
    /*
    * The scope of this modifier is limited to the package only
    * only classes in this package can access this class (with default modifier)
    * no other classes outside this class can access this class
    */

    // for example down below:
    // we have two classes - Addition and DefaultAccessModifier
}

package qwerty;

public class Addition {
    /* Since we did not mention any access modifiers here
     * it would be considered as default
     */
    int addTwoNumners(int a, int b) {
        return a + b;
    }
}

package zxcvb;

/* We are importing the qwerty package
* but we get an error anyway because
* the class we are trying to use
* has default access modifier
*/
import qwerty.*;
public class Test {
    public static void main(String[] args) {
        Addition object = new Addition();
        /* It will give us an error:
         * because we are trying to access
         * the default method in another package
         */
        object.addTwoNumners(77, 11);
    }
}
