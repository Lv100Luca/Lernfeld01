package SequenzelleProgrammierung;

import Models.Temperature;

import static Utils.ConsoleHelpers.GetNumberFromConsole;

public class Task4 {
    public static void main(String[] args) {
        var inputTemperature = GetNumberFromConsole("Enter temperature in Celsius:");

        var temperature = new Temperature(inputTemperature);

        System.out.println(temperature);
    }
}
