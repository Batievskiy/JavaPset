// how to create new Objects in Java?
// let's find out
public class NewKeywordObject {

    // using new Keyword - most basic way to create an object
    String name = "I'm an Object made using `new` keyword :)";

    public static void main(String[] args) {
        // let's create an Object of NewObjectBasics using keyword
        NewKeywordObject object1 = new NewKeywordObject();
        System.out.println(object1.name);
    }
}
