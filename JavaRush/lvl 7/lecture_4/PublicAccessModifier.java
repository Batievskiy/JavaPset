// what is Public access Modifier?
// this is detailed explanation for beginners in programing like me.)
public class PublicAccessModifier {
    /* The members, methods and classes that are declared public
    * can be accessed from anywhere.
    * this modifier doesn't put any restriction on the access
     */

    // for example below:
}

/* method divideTwoNumbers() has public modifier
* and class Test is able to access this method
* without even extending the Divide class
* this is because public modifier has visibility everywhere
 */
package qwerty;

public class Divide {
    public int divideTwoNumbers(int a, int b) {
        return a / b;
    }
}

package zxcvb;
import qwerty.*;
class Test {
    public static void main(String[] args) {
        Divide object = new Divide();
        System.out.println(object.divideTwoNumbers(44, 77));
    }
}

