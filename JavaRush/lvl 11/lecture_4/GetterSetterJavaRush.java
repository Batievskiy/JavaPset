// all classes have to contain get method and set method
public class GetterSetterJavaRush {
    public static void main(String[] args) {

    }
}
class Person {
    private String name;
    // Constructor
    public Person(String name) {
        this.name = name;
    }
    // returns value of name
    public String getName() {
        return name;
    }
    // changes value of name
    public void setName(String name) {
        this.name = name;
    }
}
