// Pyramid.java - Implements Shape and Volume

import java.util.Scanner;

class Pyramid extends Shape implements Volume {
    private double baseSide, height;

    public Pyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return baseSide * baseSide;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(baseSide, 2) * height;
    }

    public static Pyramid getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base side of Pyramid: ");
        double baseSide = sc.nextDouble();
        System.out.print("Enter height of Pyramid: ");
        double height = sc.nextDouble();
        return new Pyramid(baseSide, height);
    }
}
