package Animal;

public class Animal {
    String name;
    String type;
    int age;
    double weight;

    Animal (String name, String type, int age, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    void rest() {
        System.out.println(this.name + " is resting.");
    }

    void hunt() {
        System.out.println(this.type + "'s are starting to hunt.");
    }
    
}
