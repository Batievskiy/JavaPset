// how to create new Objects in Java?
// let's find out
public class CloneMethodObject {

    // whenever clone() method is called on any object,
    // the JVM actually creates a new object
    // and copies all content ot the previous object into it.
    // Creating an object using the clone method does not invoke any constructor.
    // To use clone() method on an object we need to implement Cloneable
    // and define the clone() method in it

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "I am a clone of an object :0";
    public static void main(String[] args) {
        CloneMethodObject object1 = new CloneMethodObject();
        try {
            CloneMethodObject object2 = (CloneMethodObject) object1.clone();
            System.out.println(object2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Here we are creating the clone of an existing Object and not any new Object.
        // Class need to implement Cloneable Interface
        // otherwise it will throw CloneNotSupportedException.
    }
}
