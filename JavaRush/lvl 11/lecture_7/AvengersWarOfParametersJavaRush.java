// JavaRush lvl 11 lecture 7
// Method Overloading
public class AvengersWarOfParametersJavaRush {
    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHello("Tony Stark");
        jarvis.sayHello("Thor", "Loki");
        jarvis.sayHello("Jack", "Helen", "Petra", "Nick");
    }
}

class Jarvis {
    // method for one name only
    public void sayHello(String firstGuest) {
        System.out.println("Greetings, " + firstGuest + ". Enjoy Yourself :)");
    }

    // Overload method for two names
    public void sayHello(String firstGuest, String secondGuest) {
        System.out.println("Hi, " + firstGuest + " and " +
                secondGuest + ". How have you been?");
    }

    // Overload method for N names as parameters
    public void sayHello(String... names) {
        for (String name : names) {
            System.out.println("Hi, " + name + ". What's up?");
        }
    }
}