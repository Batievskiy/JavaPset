// JavaRush lvl 11 lecture 7
// Getters and Setters ans validation
public class GettersSettersValidationJavaRush {
    public static void main(String[] args) {

        // let's create default Cat
        Cat defaultCat = new Cat();
        System.out.println("---< Default Cat >---");
        System.out.println("defaultCat's name -> " + defaultCat.getName());
        System.out.println("defaultCat's age -> " + defaultCat.getAge());
        System.out.println();

        // let's create real Cat
        Cat catReal = new Cat();
        String catRealName = "Bucks";
        double catRealAge = 1.5;
        catReal.setName(catRealName);
        catReal.setAge(catRealAge);
        System.out.println("---< Real Cat >---");
        System.out.println("catReal's name -> " + catReal.getName());
        System.out.println("catReal's age -> " + catReal.getAge());
        System.out.println();

    }
}

class Cat {
    private String name;
    private double age;

    // default Constructor
    public Cat() {
        setName("UNKNOWN");
        setAge(0);
    }

    public Cat(String name, double age) {
        // correct way to initialize parameters in Constructor
        // is using setters
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // basic check if name is nothing ""
        if (name.equals("")) {
            System.out.println("that's not a name!");
        } else this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        // basic check if age less than 0
        if (age < 0) {
            System.out.println("age can't be less than 0");
            this.age = 0.1; // set age to at least 0.1
        } else this.age = age;
    }

}
