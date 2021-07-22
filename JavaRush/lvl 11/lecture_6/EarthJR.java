public class EarthJR {
    public static void main(String[] args) {
        new Africa(30_370_000);
        new Antarctica(14_200_000);
        new Australia(8_600_000);
        new Eurasia(55_000_000);
        new NorthAmerica(24_709_000);
        new SouthAmerica(17_840_000);
    }
}

class Africa {
    private final int area;

    public Africa(int area) {
        this.area = area;
    }
}

class Antarctica {
    private final int area;

    public Antarctica(int area) {
        this.area = area;
    }
}

class Australia {
    private final int area;

    public Australia(int area) {
        this.area = area;
    }
}

class NorthAmerica {
    private final int area;

    public NorthAmerica(int area) {
        this.area = area;
    }
}

class SouthAmerica {
    private final int area;

    public SouthAmerica(int area) {
        this.area = area;
    }
}

class Eurasia {
    private final int area;

    public Eurasia(int area) {
        this.area = area;
    }
}
