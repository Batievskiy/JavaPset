// what is Constructors in Java?
// let's find out
public class ConstructorsBasics {

    /* a Constructor in Java is a similar to a method
    // that is invoked when an object of the class is created.
    // Unlike Java methods, a Constructor has the same name
    // as that of the class and does not have any return type

    class Text {
        // here Text is a Constructor
        Text() {
        // constructor body
        }
    }

    */// let's try it!

    // Constructors Overloading in Java
    // we can also create two or more constructors with different parameters
    // its called constructor overloading

    // let's create No-Arg Constructor - not have any parameters(arguments)
    private String name;
    public ConstructorsBasics() {
        System.out.println("Hello :) I am the Constructor :)");
        this.name = "Super-Duper-Constructor :)";
    }

    // let's create Parameterized Constructor
    String languages;
    ConstructorsBasics(String name) {
        this.languages = name;
        System.out.println("Hello :) I am the Constructor :)");
        System.out.println(this.languages + " Parameterized Constructor");
    }




    public static void main(String[] args) {
        // No-Arg Constructor constructor is invoked while creating an object of the main class
        ConstructorsBasics object = new ConstructorsBasics();
        System.out.println("The name is " + object.name);
        System.out.println();

        // call Parameterized Constructor by passing a single value
        ConstructorsBasics object2 = new ConstructorsBasics("JAVA");
        System.out.println();

        // let's call Default Constructor
        // the Java compiler automatically create a No-Arg constructor
        // if we don't create any constructor
        ConstructorsBasics object3 = new ConstructorsBasics();
        String defaultName = "Benny";
        System.out.println(defaultName + " is Default Constructor :) ");
        System.out.println();
    }
}
