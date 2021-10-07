public class AbstractClass {
}

abstract class BodyGuard {
    abstract void applyMartialArts(Attacker attacker);

    Gun gun = new Gun();

    void shoot(Attacker attacker) {
        gun.shoot(attacker);
    }

    void saveClientLife(Attacker attacker) {
        if (attacker.hasGun(attacker)) {
            shoot(attacker);
        } else {
            applyMartialArts(attacker);
        }
    }
}

abstract class Attacker {
    boolean hasGun(Attacker attacker) {
        return true;
    }
}

class Gun {
    void shoot(Attacker attacker) {
        
    }
}
