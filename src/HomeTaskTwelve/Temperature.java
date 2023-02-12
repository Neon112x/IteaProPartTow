package HomeTaskTwelve;

public class Temperature extends TempConversion{

    public static double celsius;


    @Override
    public void convertFahrenheit() {
        System.out.println(celsius + " Celsius = " + celsius * 1.8000 + 32 +" in Fahrenheit");
    }

    @Override
    public void convertKelvins() {
        System.out.println(celsius + " Celsius = " + celsius + 273.15 + " in Kelvins");
    }
}
