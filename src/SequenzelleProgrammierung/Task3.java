package SequenzelleProgrammierung;

public class Task3 {
    public static void main(String[] args) {
        Task3a();
        Task3b();
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

    private static double Task3Formula(double x) {
        // 3x^2 - 8x + 4
        return (Math.pow(x, 2) * 3) - (8 * x) + 4;
    }

    private static void PrintFormulaResult(double x, double result) {
        System.out.println(x + " -> " + result);
    }
}
