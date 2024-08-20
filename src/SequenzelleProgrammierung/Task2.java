package SequenzelleProgrammierung;

import Utils.ConsoleHelpers;
import Utils.MathematicsHelpers;

public class Task2 {
    public static void main(String[] args) {
        var num1 = ConsoleHelpers.GetNumberFromConsole();
        var num2 = ConsoleHelpers.GetNumberFromConsole();

        MathematicsHelpers.PrintDiffAndSum(num1, num2);
    }
}
