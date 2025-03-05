// Shape.java - Abstract class for all shapes

abstract class Shape {
    protected String shapeName;

    // Constructor to initialize shape name
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Method to print shape name
    public void printShape() {
        System.out.println("\nShape: " + shapeName);
    }
}
