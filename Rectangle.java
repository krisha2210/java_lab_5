// Rectangle.java - Implements Shape class

import java.util.Scanner;

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static Rectangle getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        return new Rectangle(length, width);
    }
}
