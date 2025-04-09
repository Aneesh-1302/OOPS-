package L5;

public class L5P3 {
    // Static nested class
    public static class Forecast {
        private String city;
        private double temperature;
        private double humidity;

        public Forecast(String city, double temperature, double humidity) {
            this.city = city;
            this.temperature = temperature;
            this.humidity = humidity;
        }

        public String predictWeather() {
            if (temperature > 30 && humidity < 50) {
                return "Sunny";
            } else if (humidity > 70) {
                return "Rainy";
            } else {
                return "Cloudy";
            }
        }

        public void displayForecast() {
            System.out.println("City: " + city + " - Forecast: " + predictWeather());
        }
    }

    public static void main(String[] args) {
        // Creating an array of Forecast objects
        Forecast[] forecasts = {
            new Forecast("New York", 25, 60),
            new Forecast("Los Angeles", 35, 40),
            new Forecast("London", 18, 80),
            new Forecast("Mumbai", 30, 85)
        };

        // Displaying weather predictions for each city
        for (Forecast forecast : forecasts) {
            forecast.displayForecast();
        }
    }
}
