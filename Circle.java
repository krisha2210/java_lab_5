// Circle.java - Implements Shape class

import java.util.Scanner;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static Circle getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
}
