import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;

public class InterfacesAndClasses {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // the run() method of the Timer class will be called here
        timer.run();

        Runnable runnable = new Timer();
        // the run() method of the Timer class will be called here
        runnable.run();

        Calendar calendar = new Calendar();
        // the run() method of the Calendar class will be called here
        calendar.run();
        System.out.println();

        // You can always assign
        // a reference to an object to a variable of any type
        // if this type is one of the object's parent classes.
        ArrayList<Runnable> listRunnable = new ArrayList<>();
        listRunnable.add(new Timer());
        listRunnable.add(new Calendar());

        for (Runnable element : listRunnable) {
            element.run();
        }
    }
}

// primitive interface
interface Runnable {
    void run();
}

// class that implements Runnable interface
// has to implement all methods from interface Runnable
class Timer implements Runnable {
    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }
}

class Calendar implements Runnable {
    public void run() {
        var date = LocalDate.now(); // var type of LocalDate
        System.out.println("today is : " + date.getDayOfWeek());
    }
}
