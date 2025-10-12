package Interface;

public class Main {

    // Interface = A blueprint for a class that specifies a set of abstract methods that implementing
    // classes MUST define
    // Supports multiple inheritance-like behavior

    public static void main(String[] args) {
        
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        System.out.println("\n===== Interface Usage =====");
        System.out.println("Fish: "); fish.flee(); fish.hunt();
        System.out.println("\nHawk: "); hawk.hunt();
        System.out.println("\nRabbit: "); rabbit.flee();
    }
    
}