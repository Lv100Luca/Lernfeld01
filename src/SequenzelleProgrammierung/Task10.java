package SequenzelleProgrammierung;

import static Utils.ConsoleHelpers.GetIntFromConsole;

public class Task10 {
    public static void main(String[] args) {
        var april = GetIntFromConsole("Niederschlagsmenge (in mm) im April: ");
        var may = GetIntFromConsole("Niederschlagsmenge (in mm) im Mai: ");
        var june = GetIntFromConsole("Niederschlagsmenge (in mm) im Juni: ");

        var total = april + may + june;

        var average = total / 3d;


        System.out.println("Average: " + average);
    }
}
