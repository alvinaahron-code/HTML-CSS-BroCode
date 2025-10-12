package Polymorphism;

public class Bike extends Vehicle implements Mechanism {

    @Override
    public void go() {
        System.out.println("You ride the bike");
    }

    @Override
    public void forward() {
        System.out.println("You accelerate the bike forward");
    }
    
}