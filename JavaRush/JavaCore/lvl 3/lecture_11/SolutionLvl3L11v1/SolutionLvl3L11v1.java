// create interface Weather in class Today
// figure out how the 'type' argument is associated with the method getWeatherType()
// look close that interface Weather and WeatherType are implemented in a separate files.

public class SolutionLvl3L11v1 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }
        @Override
        public String getWeatherType() {
            return this.type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
}