public class OOPhone {
    public static void main(String[] args) {
        User user = new User("James");

        AbstractPhone abstractPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        Smartphone smartphone = new Smartphone(2021, 48, "Android 12");
        String number = "555-3949-763";

        user.callAnotherUser(number, abstractPhone);
        user.callAnotherUser(number, phone);
        user.callAnotherUser(number, videoPhone);
        smartphone.install("Foobar2021");
        user.callAnotherUser(number, smartphone);
    }
}

abstract class AbstractPhone {
    private int year;

    public AbstractPhone() {
        // default constructor...
    }

    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(String outputNumber);
    public abstract void ring(String inputNumber);
}

class SomePhone extends AbstractPhone {
    private int year;
    private String company;

    public SomePhone(int year, String company) {
        super(year);
        this.company = company;
    }

    private void openConnection() {
        // findCommutator
        // openConnection...
    }

    @Override
    public void call(String outputNumber) {
        openConnection();
        System.out.println("calling...");
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("ringing...");
    }
}

abstract class WirelessPhone extends AbstractPhone {
    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}

class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("calling this number : " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("phone number calls : " + inputNumber);
    }
}

class Smartphone extends CellPhone {
    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("Installing the program : " + program +
                " for " + operationSystem);
    }
}

class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Rotate the handle!");
        System.out.println("Give the subscriber's number, Sir!");
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Phone is ringing!");
    }
}

class Phone extends AbstractPhone {
    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Calling the number : " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Phone is ringing");
    }
}

class VideoPhone extends AbstractPhone {
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Video chat for the subscriber : " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Video chat is on : " + inputNumber);
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(String number, AbstractPhone phone) {
        phone.call(number);
    }
}