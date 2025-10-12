package Abstraction;

public class Main {
    // Abstract = Used to define abstract classes and methods
    // Abstraction = the process of hiding implementation details and showing only essential features
    // Abstract classes CANNOT be instantiated directly
    // Can contain 'abstract' methods (which must be implemented)
    // Can contain 'concrete' methods (which are inherited)

    public static void main(String[] args) {
        
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5, 4);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println("\n========== AREA OF SHAPES ==========");
        System.out.print("Area of a Circle: " + circle.area() + ", "); circle.display();
        System.out.print("Area of a Triangle: " + triangle.area() + ", "); triangle.display();
        System.out.print("Area of a Rectangle: " + rectangle.area() + ", "); rectangle.display();
        
        // triangle.area(); this does not work since abstract double area() is abstract use sysout instead
    }

}