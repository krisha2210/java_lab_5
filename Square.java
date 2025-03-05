// Square.java - Implements Shape class

import java.util.Scanner;

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public static Square getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
}
