package Inheritance;

public class Main {
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods from another class
        // Child <- Parent <- Grandparent
        // Child inherits from Parent, Parent inherits from Grandparent

        Dog dog = new Dog();
        Sheep sheep = new Sheep();

        System.out.println();
        System.out.println("=== DOG ===" );
        System.out.println("Weight: " + dog.weight + "kg");
        System.out.println("Alive: " + dog.isAlive);
        dog.speak();
        dog.eat();

        System.out.println("\n=== SHEEP ===");
        System.out.println("Weight: " + sheep.weight + "kg");
        System.out.println("Alive: " + sheep.isAlive);
        sheep.speak();
        sheep.eat();
    }
    
}
