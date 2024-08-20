package SequenzelleProgrammierung;

import static Utils.ConsoleHelpers.GetNumberFromConsole;

public class Task6 {
    public static void main(String[] args) {
        var distance = GetNumberFromConsole("Enter distance in km: ");
        var consumption = GetNumberFromConsole("Enter total consumption in liters: ");

        var averagePerKM = consumption / distance;

        var averagePer100KM = averagePerKM * 100f;

        System.out.printf("Average consumption per 100km: %.4f l/100km%n", averagePer100KM);
    }
}
