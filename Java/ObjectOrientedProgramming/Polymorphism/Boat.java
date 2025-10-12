package Polymorphism;

public class Boat extends Vehicle implements Mechanism {

    @Override
    public void go() {
        System.out.println("You sail the boat");
    }

    @Override
    public void forward() {
        System.out.println("You set sail the boat forward");
    }
    
}