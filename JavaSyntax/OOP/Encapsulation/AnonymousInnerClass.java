import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        // anonymous class:
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("General resources monitor has launched");
            }

            // we can create its own methods as in common class:
            public void anonymousMethod() {
                System.out.println("anonymousMethod");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Error tracking monitor has launched");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitor has started");
            }
            public static int staticI = 100;
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

        // Curious way to get to anonymous method:
        // but we have to handle two exceptions
        // - java.lang.reflect.InvocationTargetException;
        // - java.lang.IllegalAccessException;
        Class myClass = generalModule.getClass();
        Method[] methods = myClass.getMethods();
        try {
            for (Method method : methods) {
                if (method.getName().equals("anonymousMethod")) {
                    method.invoke(generalModule);
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        } catch (InvocationTargetException e) {
            System.out.println("InvocationTargetException");
            e.printStackTrace();
        }
    }
}

// creating a common interface for future classes
interface MonitoringSystem {
    public void startMonitoring();
}
