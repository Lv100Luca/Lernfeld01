package SequenzelleProgrammierung;

import Models.Amount;

import static Utils.ConsoleHelpers.GetIntFromConsole;

public class Task8 {
    public static void main(String[] args) {
        var amountInput = GetIntFromConsole("Enter amount: ");

        var amount = new Amount(amountInput);
        amount.printAmount();
        amount.printAmount2();
    }
}
