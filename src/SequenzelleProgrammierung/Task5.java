package SequenzelleProgrammierung;

import static Utils.ConsoleHelpers.GetNumberFromConsole;

public class Task5 {
    public static void main(String[] args) {
        var pricePerLiter = 1.5f;
        var taxRate = 0.19f;

        var gasPumped = GetNumberFromConsole("Enter pumped amount in liters: ");

        var price = pricePerLiter * gasPumped;
        var tax = price * taxRate;
        var priceWithTax = price + tax;

        System.out.printf("Pumped: %.1f liters%n", gasPumped);
        System.out.printf("Price per liter: %.2f€%n", pricePerLiter);
        System.out.printf("Price without tax: %.2f€%n", price);
        System.out.printf("Tax: %.2f€%n", tax);
        System.out.printf("Price with tax: %.2f€%n", priceWithTax);

    }
}
