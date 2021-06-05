// what is Hierarchical Inheritance in Java?
// let's find out
public class HierarchicalInheritance {

    // in Hierarchical Inheritance - one class serves
    // as a Super Class (base class) for more than one subclass.

    // Super Class
    static class Employee {
        float salary = 40_000f;

        void displaySalary() {
            System.out.println("The Employee salary is: " + salary);
        }
    }

    // subclass inherits from Super Class
    static class PermanentEmployee extends Employee {
        double hike = 0.5;

        void incrementSalary() {

            // the super keyword is a reference variable in Java
            // which is used to reference variables and methods of the parent class object
            super.displaySalary();
            System.out.println("The Permanent Employee incremented salary is: "
                    + (salary + (salary * hike)));
        }
    }

    // subclass inherits from Super Class
    static class TemporaryEmployee extends Employee {
        double hike = 0.35;

        void incrementSalary() {
            System.out.println("The Temporary Employee incremented salary is: "
                    + (salary + (salary * hike)));
        }
    }

    public static void main(String[] args) {
        PermanentEmployee perm = new PermanentEmployee();
        TemporaryEmployee temp = new TemporaryEmployee();

        // here All the objects of inherited classes
        // can access the variables of class Employee
        perm.incrementSalary();
        temp.incrementSalary();
    }



}
