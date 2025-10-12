package MethodOverriding;

public class Main {
    // Mentioned in Super folder
    // Method overriding = When a subclass (Child) provides its own 
    // implementation of a method that is already defined
    // Allows for code reusability and give specific implementations

    // If you use @Override, that method will be used first rather than the void move() in Parent class
    
    public static void main(String[] args) {
        
    Dog dog = new Dog();
    Bird bird = new Bird();
    Capybara capybara = new Capybara();
    Fish fish = new Fish();

    System.out.println();
    dog.move();
    capybara.move();
    fish.move();
    bird.move();

    }
}
