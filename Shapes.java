import java.util.Scanner;
class Shape {
    // Area of a rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}
// Subclass 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
// Subclass 2
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }
}
// Main class
public class Shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Enter the side of the square:");
        double side = input.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of the square: " + square.calculateArea());
        System.out.print("Enter the length of the rectangle:");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double breadth = input.nextDouble();
        Shape rectangle = new Shape(); 
        System.out.println("Area of the rectangle: " + rectangle.calculateArea(length, breadth));
    }
}
