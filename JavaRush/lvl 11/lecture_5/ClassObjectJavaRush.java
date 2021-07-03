// JavaRush lvl 11 lecture 5
// Class Object in Java
public class ClassObjectJavaRush {

    // all the Classes in Java are inherited from Class Object
}

// this is how Class Person inherits methods from Class Object
class Person /* extends Object */ {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(int age) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // inherited methods from Class Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        if (getAge() != person.getAge()) {
            return false;
        }
        // if obj not Class Person
        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }
}
