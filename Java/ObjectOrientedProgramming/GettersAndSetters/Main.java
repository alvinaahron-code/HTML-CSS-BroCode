package GettersAndSetters;

public class Main {

    // Help protect object data and add rules for accessing or modifying them
    // GETTERS = Methods that make a field READABLE
    // SETTERS = Methods that make a field WRITEABLE

    public static void main(String[] args) {
        
        // This works without getters and setters but it can be changed
        // smartphone.model = "Android" (and we don't want that)
        Smartphone smartphone = new Smartphone("iPhone", "White", 2025);
        
        // Without getters and setters
        //System.out.println(smartphone.model + " " + smartphone.color + " " + smartphone.year);

        // Changing attributes using setters
        // No setModel() because we didn't want to change the iPhone to another model
        System.out.println();
        smartphone.setColor("Black");
        smartphone.setYear(2022); // Check validation in Smartphone.java
        // 2022 prompted the if-else validation
        // It returned this.year = year; from getYear() { return this.year; }

        // Using getters
        System.out.println("\n========== GETTERS & SETTERS ==========");
        System.out.println(smartphone.getModel() + " " + smartphone.getColor() + " " + smartphone.getYear());
    }
    
}