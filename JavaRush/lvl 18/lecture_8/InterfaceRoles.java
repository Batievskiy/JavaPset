import java.util.ArrayList;

public class InterfaceRoles {
    public static void main(String[] args) {
        ArrayList<Object> screamers = new ArrayList<>();
        screamers.add(new Girl());
        screamers.add(new Boy());
        screamers.add(new Fish());

        // force to scream all screamers
        for (Object screamer : screamers) {
            if (screamer instanceof Sound) {
                Sound makeAScream = (Sound) screamer;
                makeAScream.scream();
            }
        }
        // or using pattern variable
        for (Object screamer : screamers) {
            if (screamer instanceof Sound makeAScream) {
                makeAScream.scream();
            }
        }
    }
}

interface Sound {
    void scream();
}

class Girl implements Sound {
    @Override
    public void scream() {
        System.out.println("Aaieeeee!");
    }
}
class Boy implements Sound {
    public void scream() {
        System.out.println("Arrrrrrr!");
    }
}

class Fish implements Sound {
    public void scream() {
        System.out.println(",.o0");
    }
}