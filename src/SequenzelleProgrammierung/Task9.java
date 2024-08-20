package SequenzelleProgrammierung;

public class Task9 {
    public static void main(String[] args) {
        // formula s = 0.5 * g * t^2
        // t = sqrt(2 * s / g)

        var height = 12; // in meters

        final double g = 9.81; // in m/s^2

        System.out.println("height: " + height);
        var time = Math.sqrt(2 * height / g);

        System.out.println("Time falling: " + time);

        var speed = g * time;

        System.out.println("Speed (m/s): " + speed);

        var speedkmh = speed * 3.6;

        System.out.println("Speed (km/h): " + speedkmh);
    }
}
