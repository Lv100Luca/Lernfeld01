public class Temperature {
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double celsius;

    public double fahrenheit() {
        return (celsius * 9) / 5 + 32;
    }

    @Override
    public String toString() {
        return String.format("Temperature: %.1f°C/%.1f°F", celsius, fahrenheit());
    }
}
