// JavaRush lvl 11 lecture 7
// Methods, parameters and Override
public class MethodsParametersOverrideJavaRush {
    public static void main(String[] args) {

        Truck trkFirst = new Truck();
        trkFirst.setWeight(10_000);
        Truck trkSecond = new Truck();
        trkSecond.setWeight(20_000);

        BridgeOfficer bridgeOfficer = new BridgeOfficer(15_000);
        System.out.println("truckFirst: \"Hello Officer! May I drive over the bridge?\"");
        boolean canTruckFirst = bridgeOfficer.checkTruck(trkFirst);
        bridgeOfficer.officerAnswer(canTruckFirst);

        System.out.println();

        System.out.println("truckSecond: \"Hello Officer! May I drive over the bridge?\"");
        boolean canTruckSecondGo = bridgeOfficer.checkTruck(trkSecond);
        bridgeOfficer.officerAnswer(canTruckSecondGo);
    }
}

// Truck has its parameters and weight that is gonna need further
class Truck {
    int length;
    int weight;
    int height;
    int width;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // we can calculate volume of the truck
    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}

// Police Officer can check Trucks weight
class BridgeOfficer {
    int maxWeight;

    // Constructor that takes weight as parameter
    public BridgeOfficer(int allowedWeight) {
        this.maxWeight = allowedWeight;
    }
    // Officer checks Trucks weight
    public boolean checkTruck(Truck truck) {
        // if Trucks weight more than maxWeight
        if (truck.weight > maxWeight) {
            return false; //  -> not allowed to pass through the Bridge
        } else return true;
    }
    // Officers answer
    public void officerAnswer(boolean isAllowed) {
        if (isAllowed) {
            System.out.println("You can drive over, Sir :)");
        } else System.out.println("You are NOT ALLOWED to drive!");
    }
}
