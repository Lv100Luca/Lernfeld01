import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequentialProgramming {
    public static void main(String[] args) {
//        Task1();
//
//        Task2();
//
//        Task3a();
//        Task3b();

//        Task4();

//        Task5();

//        Task6();

        Task7();

        Task8();
    }

    private static void Task1() {
        System.out.println("Task 1");
        var num1 = 123.345f;
        var num2 = 76.543f;

        PrintDiffAndSum(num1, num2);
    }

    private static void Task2() {
        System.out.println("Task 2");
        var reader = new BufferedReader(
                new InputStreamReader(System.in));

        var num1 = GetNumberFromConsole();
        var num2 = GetNumberFromConsole();

        PrintDiffAndSum(num1, num2);
    }

    private static double GetNumberFromConsole() {
        return GetNumberFromConsole("Enter number:");
    }

    private static double GetNumberFromConsole(String prompt) {
        var reader = new BufferedReader(
                new InputStreamReader(System.in));
        double num;

        try {
            System.out.print(prompt);
            num = Double.parseDouble(reader.readLine());
        } catch (Exception e) {
            System.out.println("Error: Could not parse input.");
            throw new RuntimeException();
        }

        return num;
    }

    private static void PrintDiffAndSum(double num1, double num2) {
        var sum = num1 + num2;
        var diff = num1 - num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }

    private static void Task3a() {
        System.out.println("Task 3a");
        // todo add test here
        double[] values = new double[]{
                0.66f, 2f, 4f, 12.45f,
        };

        RunFormulaFor(values);
    }

    private static void Task3b() {
        System.out.println("Task 3b");
        var x = 0f;
        while (x <= 10) {
            var result = Task3Formula(x);
            PrintFormulaResult(x, result);
            x += 2f;
        }
    }

    private static void RunFormulaFor(double... values) {
        for (double value : values) {
            PrintFormulaResult(value, Task3Formula(value));
        }
    }

    private static void PrintFormulaResult(double x, double result) {
        System.out.println(x + " -> " + result);
    }

    private static double Task3Formula(double x) {
        // 3x^2 - 8x + 4
        return (Math.pow(x, 2) * 3) - (8 * x) + 4;
    }


    private static void Task4() {
        System.out.println("Task 4");
        var reader = new BufferedReader(
                new InputStreamReader(System.in));

        var temperatureNum = GetNumberFromConsole("Enter temperature in Celsius:");

        var temperature = new Temperature(temperatureNum);

        System.out.println(temperature);
    }

    private static void Task5() {
        System.out.println("Task 5");

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

    private static void Task6() {
        System.out.println("Task 6");

        var distance = GetNumberFromConsole("Enter distance in km: ");
        var consumption = GetNumberFromConsole("Enter total consumption in liters: ");

        var averagePerKM = consumption / distance;

        var averagePer100KM = averagePerKM * 100f;

        System.out.printf("Average consumption per 100km: %.4f l/100km%n", averagePer100KM);
    }

    private static void Task7() {
        System.out.println("Task 7");

        var radius = GetNumberFromConsole("Enter radius of circle: ");

        new Circle(radius).printf();
    }

    private static void Task8() {
        System.out.println("Task 8");

    }
}
