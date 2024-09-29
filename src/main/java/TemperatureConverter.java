
public class TemperatureConverter {

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Kelvin to Celsius.
     *
     * @param kel The temperature in Kelvin.
     * @return The temperature in Celsius.
     */
    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Checks if the given Celsius temperature is extreme.
     *
     * @param celsius The temperature in Celsius.
     * @return True if the temperature is below -40 or above 50, otherwise false.
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    /**
     * Converts Kelvin to Fahrenheit.
     *
     * @param kel The temperature in Kelvin.
     * @return The temperature in Fahrenheit.
     */
    public static double kelvinToFah(double kel) {
        return Math.round((kel-273.15) * (9/5) + 32);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        // Example usage of the conversion methods
        double fahrenheit = 100.0;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is " + celsius + "°C");

        float kelvin = 300.0f;
        float celsiusFromKelvin = converter.kelvinToCel(kelvin);
        System.out.println(kelvin + "K is " + celsiusFromKelvin + "°C");

        double celsiusTemp = 40.0;
        boolean isExtreme = converter.isExtremeTemperature(celsiusTemp);
        System.out.println("Is " + celsiusTemp + "°C an extreme temperature? " + isExtreme);
    }
}
