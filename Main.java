// Krisha shah
// 24070126512
// B3


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Shape Calculator Menu ====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;
            switch (choice) {
                case 1: shape = Circle.getUserInput(); break;
                case 2: shape = Rectangle.getUserInput(); break;
                case 3: shape = Square.getUserInput(); break;
                case 4: shape = Sphere.getUserInput(); break;
                case 5: shape = Cylinder.getUserInput(); break;
                case 6: shape = Pyramid.getUserInput(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }

            if (shape != null) {
                shape.printShape();
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
                if (shape instanceof Volume) {
                    System.out.println("Volume: " + ((Volume) shape).calculateVolume());
                }
            }
        } while (choice != 7);

        scanner.close();
    }
}
