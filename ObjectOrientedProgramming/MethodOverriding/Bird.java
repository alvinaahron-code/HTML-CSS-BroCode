package MethodOverriding;

public class Bird extends Animal {
    
    @Override
    void move() {
        System.out.println("The bird is flying");
    }
}