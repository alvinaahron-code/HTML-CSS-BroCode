package Animal;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Tiger", "Mammal", 10, 70);
        Animal animal2 = new  Animal("Shark", "Amphibian", 25, 85);    

        System.out.println("\n========== ANIMAL DISCOVERY ==========");
        System.out.println("Name: " + animal.name + " | Type: " + animal.type + " | Age: " + animal.age
        + " | Weight: " + animal.weight);

        System.out.println("Name: " + animal2.name + " | Type: " + animal2.type + " | Age: " + animal2.age
        + " | Weight: " + animal2.weight);

        System.out.println("\n----------------------------------------");
        animal.rest();
        animal2.hunt();
    }

}
