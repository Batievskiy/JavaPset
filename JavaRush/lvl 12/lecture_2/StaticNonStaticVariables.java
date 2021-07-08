// what is difference between static
// and nonstatic variables in Java?
// let's find out
public class StaticNonStaticVariables {

    /* Regular Class variables are bound to Object of their Class(Class instance)
       Static Class variables are bound to a static Class Object.

       If there are several instances of a Class,
       each of them has its own copy of non-static Class variables.
       Static Class variables are always inside  static Class Object
       and only exist in one instance.

       You can access non-static Class variables
       only with a reference to the Class Object.
       Or in methods within the same Class.
     */
    public static void main(String[] args) {

        DataInfo dataInfo = new DataInfo();

        System.out.println(dataInfo.value); // access with an instance reference

        System.out.println(DataInfo.value); // access without a reference
    }
}

class DataInfo {
    public static int value = 100;
}
