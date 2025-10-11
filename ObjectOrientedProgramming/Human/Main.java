package Human;

public class Main {
    public static void main(String[] args) {
        
        // Constructor = Special method that is called when an object is instatiated (created)
        // Check Human.java to see how to create the constructor
        // To create a human we need to send our constructor the parameters set

        System.out.println("=============================================");
        Human human1 = new Human("Rick", 50, 65); 
        Human human2 = new Human("Morty", 18, 55);

        System.out.println("Name: " + human1.name + " | Age: " + human1.age + " | Weight: " + human1.weight);
        System.out.println("Name: " + human2.name + " | Age: " + human2.age + " | Weight: " + human2.weight);

        System.out.println("---------------------------------------------");

        human1.eat();
        human2.drink();

    }
}
