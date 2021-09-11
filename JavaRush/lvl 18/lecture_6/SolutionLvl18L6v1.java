// the class Person is abstract
// make this class regular and add some basic logic to it
// getters and setters

public class SolutionLvl18L6v1 {
}

// recreate the class logic to a regular class
//abstract class Person {
//    private String name;
//    private int age;
//
//    public abstract String getName();
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public abstract void setAge(int age);
//}

class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
