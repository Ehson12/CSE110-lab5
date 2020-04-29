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
        float newValue = ((this.getValue() - 32) * 5)/9;
        return new Celsius(newValue);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + getValue() + " F";
    }
}