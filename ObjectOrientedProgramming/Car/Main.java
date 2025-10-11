package Car;

public class Main {
    public static void main (String [] args) {
    
        // Object = an instance of a class that may contain attributes and methods
        // Example: (Phone, Desk, Computer)

        // To construct an instance of another class
        // We can reuse a class to instantiate multiple instances of class
        // Meaning we can use the Car class to create multiple objects
        Car myCar1 = new Car(); 
        Car myCar2 = new Car(); 
        // Car = Class
        // myCar = Object name
        // newCar() = calls the constructor
        // Car.java = constructor

        
    
        // The name of the object car (myCar) and the attribute we want
        System.out.println("===================================");
        System.out.println("Made by: " + myCar1.make);
        System.out.println("Model: " + myCar1.model);
        System.out.println("Color: " + myCar1.color);
        System.out.println("Price: " + myCar1.price);
        System.out.println("Year: " + myCar1.year);

        System.out.println("\nSecond Car");
        System.out.println("Model" + myCar2.model);

        // To access the methods inside Car.java (drive(), brake())
        System.out.println("\n----------------------------------");
        myCar1.drive();
        myCar1.brake();
    }    
}
