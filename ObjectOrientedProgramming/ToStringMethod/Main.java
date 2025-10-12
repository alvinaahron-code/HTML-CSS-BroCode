package ToStringMethod;

public class Main {

    // .toString() = Method inherited from the Object Class
    // Used to return a string representation of an Object
    // By default, it returns a hash code as a unique identifier
    // It can be overridden to provide meaningful details

    public static void main(String[] args) {
        
        Smartphone smartphone = new Smartphone("iPhone", "Blue", 2025);

        System.out.println("\n========== Without toString() =========");
        System.out.println("It prints out a Hashcode: " + smartphone); // Hashcode
        System.out.println("\n----------------------------------------");
        System.out.println("REGULAR WAY OF USING SMARTPHONE OBJECT (this.model)");
        System.out.println("Model: " + smartphone.model);
        System.out.println("Color: " + smartphone.color);
        System.out.println("Year: " + smartphone.year);

        System.out.println("\n========== With toString() ==========");
        System.out.println(smartphone);
    }
    
}