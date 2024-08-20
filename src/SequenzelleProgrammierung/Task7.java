package SequenzelleProgrammierung;

import Models.Circle;

import static Utils.ConsoleHelpers.GetNumberFromConsole;

public class Task7 {
    public static void main(String[] args) {
        var radius = GetNumberFromConsole("Enter radius of circle: ");

        new Circle(radius).PrettyPrint();
    }
}
