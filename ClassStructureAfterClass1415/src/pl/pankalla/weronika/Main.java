//14.	Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
// You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
// Then create a program that calculates and displays the temperature:
//a.	25 degrees Celsius in Kelvin and Fahrenheit
//b.	100 degrees Fahrenheit in Kelvin and Celsius
//c.	0 degrees Kelvin in Celsius and Fahrenheit

//15.	Create a library of methods for the calculation of basic statistics:
//a.	Number of items within the specified range <x,y>
//b.	Sum of numbers in the given range  <x,y>
//c.	Arithmetic mean of the numbers in the given range  <x,y>
//Then create a program that calculates and displays the basic statistics for integers in the range <5,10>

package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        TemperatureCalculator calculator = new TemperatureCalculator();
        calculator.temperatureInCelsius = 25.0;

        System.out.println(calculator.temperatureInCelsius + " Celsius degrees is equal to " +
                calculator.celsiusToKelvin() + " Kelvin degrees");
        System.out.println(calculator.temperatureInCelsius + " Celsius degrees is equal to " +
                calculator.celsiusToFahrenheit() + " Fahrenheit degrees");

        calculator.temperatureInFahrenheit = 100.0;

        System.out.println(calculator.temperatureInFahrenheit + " Fahrenheit degrees is equal to " +
                calculator.fahrenheitToKelvin() + " Kelvin degrees");
        System.out.println(calculator.temperatureInFahrenheit + " Fahrenheit degrees is equal to " +
                calculator.fahrenheitToCelsius() + " Celsius degrees");

        calculator.temperatureInKelvin = 0.0;

        System.out.println(calculator.temperatureInKelvin + " Kelvin degrees is equal to " +
                calculator.kelvinToCelsius() + " Celsius degrees");
        System.out.println(calculator.temperatureInKelvin + " Kelvin degrees is equal to " +
                calculator.kelvinToFahrenheit() + " Fahrenheit degrees");

    }
}
