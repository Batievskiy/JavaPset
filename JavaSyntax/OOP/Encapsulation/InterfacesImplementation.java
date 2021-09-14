public class InterfacesImplementation {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();

        WhatsApp whatsApp = new WhatsApp();
        whatsApp.sendMessage();
        whatsApp.getMessage();

        Telegram telegram = new Telegram();
        telegram.sendMessage();
        telegram.getMessage();

        Client client = new Client();


    }
}

// here we have simplest interface
interface Swimmable {
    public void swim();
    public void voice();
}

// class Duck connects with interface Swimmable using key implements
// it means tat class Duck has to implement all the methods of interface Swimmable
class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    @Override
    public void voice() {
        System.out.println("duck-uck");
    }
}

interface Messenger {
    public void sendMessage();
    public void getMessage();
}

class Application {
    public void getName() {
        System.out.println("I'm Application");
    }
}

class WhatsApp extends Application implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("sending a message into WhatsApp");
    }
    @Override
    public void getMessage() {
        System.out.println("receiving a message in WhatsApp");
    }
}

class Telegram extends Application implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("sending a message into Telegram");
    }
    @Override
    public void getMessage() {
        System.out.println("receiving a message in WhatsApp");
    }
}

class Smartphone {
    private Application application;

    public Smartphone() {
        this.application = new WhatsApp();
    }
}

class Client {
    private Messenger messenger;
}

