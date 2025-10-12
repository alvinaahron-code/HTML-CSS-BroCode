package Polymorphism;

public class Car extends Vehicle implements Mechanism {

    @Override
    public void go() {
        System.out.println("You drive the car");
    }

    @Override
    public void forward() {
        System.out.println("You move the car forward");
    }
    
}