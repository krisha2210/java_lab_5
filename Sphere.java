// Sphere.java - Implements Shape and Volume

import java.util.Scanner;

class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Circumference of Great Circle
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static Sphere getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        double radius = sc.nextDouble();
        return new Sphere(radius);
    }
}
