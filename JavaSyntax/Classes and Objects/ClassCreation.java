// how to create Class in Java?
// let's find out
public class ClassCreation {

    // Class in Java is a blueprint for the object
    // and Object is any entity that has a state and behaviour
    // States - fields are used to store data
    // Behaviour - methods are used to perform some operations
    public static class Lamp {
        // stores the value for light
        // true id light is on
        // false if light is off
        boolean isOn;

        // method to turn the light ON
        void turnOn() {
            isOn = true;
            System.out.println("Light on? " + isOn);
        }

        // method to turn the light OFF
        void turnOff() {
            isOn = false;
            System.out.println("Light on? " + isOn);
        }
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        System.out.print("led --> ");
        led.turnOn();
        System.out.print("halogen --> ");
        halogen.turnOff();
    }
}

