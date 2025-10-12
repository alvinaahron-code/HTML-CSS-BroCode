package Polymorphism;

public class Main {
    // Polymorphism = POLY = "MANY"
    //              = MORPH = "SHAPE"
    // Objects can identify as other objects
    // Objects can be treated as objects of a common superclass (Parent Class) 
    // Can be used on interfaces (Mechanism) or classes (Vehicle)
    
    public static void main(String[] args) {
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, boat, bike};

        System.out.println("\n===== VEHICLE CLASS =====");

        for(Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        System.out.println("\n===== VEHICLE INTERFACE =====");
        Mechanism[] mechanisms = {car, boat, bike};

        for(Mechanism mechanism : mechanisms) {
            mechanism.forward();
        }
    }
}