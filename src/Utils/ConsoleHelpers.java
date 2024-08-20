package Utils;

import java.util.Scanner;

public class ConsoleHelpers {
    public static double GetNumberFromConsole() {
        return GetNumberFromConsole("Enter number:");
    }

    public static double GetNumberFromConsole(String prompt) {
        System.out.print(prompt);

        var scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int GetIntFromConsole(String prompt) {
        System.out.print(prompt);

        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
