package MethodOverriding;

public class Capybara extends Animal {
    
    @Override
    void move() {
        System.out.println("The capybara is swimming");
    }
}