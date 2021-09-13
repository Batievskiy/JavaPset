// in method createKeyboardOrchestra()
// - add organ and three pianos into orchestra list

// in method createStringOrchestra()
// - add two violin and one guitar into orchestra list

// method playOrchestra() has to call method play() from all list orchestra

import java.util.List;
import java.util.ArrayList;

public class SolutionLvl18L8v1 {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        // TODO
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        // TODO
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        // TODO
        for (MusicalInstrument instrument : orchestra) {
            instrument.play();
        }
    }
}

interface MusicalInstrument {
    void play();
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("piano is playing");
    }
}

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("guitar is playing");
    }
}

class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Organ is playing");
    }
}

class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Violin is playing");
    }
}