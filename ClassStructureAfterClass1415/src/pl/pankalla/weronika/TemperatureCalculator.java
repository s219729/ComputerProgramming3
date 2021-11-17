////14.	Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
//// You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
//// Then create a program that calculates and displays the temperature:
////a.	25 degrees Celsius in Kelvin and Fahrenheit
////b.	100 degrees Fahrenheit in Kelvin and Celsius
////c.	0 degrees Kelvin in Celsius and Fahrenheit

package pl.pankalla.weronika;

public class TemperatureCalculator {
    double temperatureInCelsius;
    double temperatureInKelvin;
    double temperatureInFahrenheit;


    public double celsiusToKelvin(){
        this.temperatureInKelvin = temperatureInCelsius + 273.15;
        return temperatureInKelvin;
    }

    public double kelvinToCelsius(){
        this.temperatureInCelsius = temperatureInKelvin - 273.15;
        return temperatureInCelsius;
    }

    public double celsiusToFahrenheit(){
        this.temperatureInFahrenheit = (9.0/5.0) * temperatureInCelsius + 32.0;
        return temperatureInFahrenheit;

    }

    public double fahrenheitToCelsius(){
        this.temperatureInCelsius = (5.0/9.0) * (temperatureInFahrenheit - 32.0);
        return temperatureInCelsius;
    }

    public double kelvinToFahrenheit(){
        this.temperatureInFahrenheit = (9.0/5.0)*(temperatureInKelvin - 273.15) + 32.0;
        return temperatureInFahrenheit;
    }

    public double fahrenheitToKelvin(){
        this.temperatureInKelvin = 273.15 +((temperatureInFahrenheit - 32.0) * (5.0/9.0));
        return temperatureInKelvin;

    }


}
