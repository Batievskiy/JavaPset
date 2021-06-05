// how to create new Objects in Java?
// let's find out
public class NewInstanceObject {

    // Using New Instance - If we know the name of the class
    // & if it has a public default constructor
    // we can create an object –Class.forName.
    // We can use it to create the Object of a Class.
    // Class.forName actually loads the Class in Java but does not create any Object.
    // To Create an Object of the Class
    // we have to use the new Instance Method of the Class.

    String name = "I am an Object created by New Instance";

    public static void main(String[] args) {
        try {
            Class newInst = Class.forName("New Instance Class");
            NewInstanceObject object1 =
                    (NewInstanceObject) newInst.newInstance();
            System.out.println(object1.name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

