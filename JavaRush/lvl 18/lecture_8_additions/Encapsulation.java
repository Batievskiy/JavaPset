public class Encapsulation {

    // Encapsulation - it is the mechanism
    // that binds together code and the data it manipulates.
    // - the variables or data of a class is hidden from any other class,
    // and can be accesses only through any member function of its own class
    // in which it is declared.

    // Encapsulation can be achieved
    // by Declaring all the variables in the class as private
    // and writing public methods in the class
    // to set and get the values of variables.

    public static void main(String[] args) {
        Encapsulated encapsulated = new Encapsulated();

        // setting values of the variables
        encapsulated.setName("Peter");
        encapsulated.setAge(35);

        // display values of the variables
        System.out.println("name: " + encapsulated.getName());
        System.out.println("age: " + encapsulated.getAge());

        // direct access of
    }
}

class Encapsulated {
    // private variables declared.
    // these can only be accessed by public methods of class.
    private String name;
    private int age;

    // all the methods below are encapsulated:

    // get method for age to access private variable age.
    public int getAge() {
        return this.age;
    }

    // get method for name to access private variable name.
    public String getName() {
        return this.name;
    }

    // set method for age to access private variable age
    public void setAge(int newAge) {
        if (newAge < 1 || newAge > 130) {
            throw new IllegalArgumentException();
        }
        this.age = newAge;
    }

    // set method for name
    public void setName(String newName) {
        this.name = newName;
    }

}
