package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Celsius(((this.getValue() - 32) * 5)/9);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + getValue() + " F";
    }
}