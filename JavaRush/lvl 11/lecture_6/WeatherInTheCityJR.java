// JavaRush lvl 11 lecture 6 problem
// create program to print Weather in the City
public class WeatherInTheCityJR {
    public static void showWeather(City city) {
        System.out.printf("the temperature %d int %s city",
                city.getTemperature(), city.getName());
    }

    public static void main(String[] args) {
        City cityDubai = new City("Dubai", 35);
        showWeather(cityDubai);
    }
}

class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        setName(name);
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
