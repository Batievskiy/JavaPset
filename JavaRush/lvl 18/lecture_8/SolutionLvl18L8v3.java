// change program to get proper speed for:
// Eagle: 180 km/h
// Raven: 48 km/h
// Flight: 1200 km/h

public class SolutionLvl18L8v3 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        System.out.println("eagles speed -> " + eagle.getMaxSpeed() + " km/h");

        Raven raven = new Raven();
        System.out.println("ravens speed -> " + raven.getMaxSpeed() + " km/h");

        Aircraft aircraft = new Aircraft();
        System.out.println("aircraft speed -> " + aircraft.getMaxSpeed() + " km/h");
    }
}

interface FlyableZ {
    //    default int getMaxSpeed() {
//        return 80;
//    }
    int getMaxSpeed();
}

class Aircraft implements FlyableZ {
    @Override
    public int getMaxSpeed() {
        return 1200;
    }
}

class Eagle implements FlyableZ {
    @Override
    public int getMaxSpeed() {
        return 180;
    }
}

class Raven implements FlyableZ {
    @Override
    public int getMaxSpeed() {
        return 48;
    }
}