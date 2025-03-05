// Cylinder.java - Implements Shape and Volume

import java.util.Scanner;

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public static Cylinder getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        double height = sc.nextDouble();
        return new Cylinder(radius, height);
    }
}
